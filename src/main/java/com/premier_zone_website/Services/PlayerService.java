package com.premier_zone_website.Services;

import com.premier_zone_website.Model.Player;
import com.premier_zone_website.Repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayer(){
        return playerRepository.findAll();
    }

    public List<Player> getPlayerFromTeam(String teamName){
        return  playerRepository.findAll().stream()
                .filter(player -> teamName.equals(player.getTeam()))
                .collect(Collectors.toList());
    }

    public  List<Player> getPlayerByName(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPlayer_name().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public  List<Player> getPlayerByNation(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getNation().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public  List<Player> getPlayerByPosition(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPos().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public  List<Player> getPlayerByAge(Integer searchAge) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getAge().equals(searchAge))
                .collect(Collectors.toList());
    }

    public  List<Player> getPlayerByGoal(Integer searchGoal) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getGls().equals(searchGoal))
                .collect(Collectors.toList());
    }

    public  List<Player> getPlayerByAssist(Integer searchAssist) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getAst().equals(searchAssist))
                .collect(Collectors.toList());
    }

    public  List<Player> getPlayerByGoalAndAssist(Integer searchGoalAndAssist) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getGa().equals(searchGoalAndAssist))
                .collect(Collectors.toList());
    }

    public  List<Player> getPlayerByTeamAndPosition(String team, String position){
        return playerRepository.findAll().stream()
                .filter(player -> team.equals(player.getTeam()) && position.equals(player.getPos()))
                .collect(Collectors.toList());
    }

    public Player updatePlayer(Player updatePlayer){
        Optional<Player> existingPlayer = playerRepository.findByName(updatePlayer.getPlayer_name());

        if(existingPlayer.isPresent()){
            Player playerToUpdate = existingPlayer.get();
            playerToUpdate.setPlayer_name(updatePlayer.getPlayer_name());
            playerToUpdate.setAge(updatePlayer.getAge());
            playerToUpdate.setAst(updatePlayer.getAst());
            playerToUpdate.setCrdr(updatePlayer.getCrdr());
            playerToUpdate.setCrdy(updatePlayer.getCrdy());
            playerToUpdate.setGa(updatePlayer.getGa());
            playerToUpdate.setGls(updatePlayer.getGls());
            playerToUpdate.setMinutes(updatePlayer.getMinutes());
            playerToUpdate.setMp(updatePlayer.getMp());
            playerToUpdate.setPk(updatePlayer.getPk());
            playerToUpdate.setNation(updatePlayer.getNation());
            playerToUpdate.setPos(updatePlayer.getPos());
            playerToUpdate.setStarts(updatePlayer.getStarts());
            playerToUpdate.setTeam(updatePlayer.getTeam());
            playerToUpdate.setXag(updatePlayer.getXag());
            playerToUpdate.setXg(updatePlayer.getXg());

            playerRepository.save(playerToUpdate);
            return playerToUpdate;
        }
        return null;
    }

}
