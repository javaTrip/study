package org.ls.controller;

import org.ls.entity.Game;
import org.ls.service.GameService;
import org.ls.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/game")
@CrossOrigin
public class GameController {
@Autowired
    private GameService gameService;

    /**
     * 添加
     */
    @RequestMapping("/addGame")
    public ServerResponse addGame(Game game){
        return gameService.addGame(game);
    }

    /**
     * 删除
     */
    @RequestMapping("/delGame")
    public ServerResponse delGame(Integer id){
        return gameService.delGame(id);
    }

    /**
     * 回显
     */
    @RequestMapping("/toUpdate2")
    public ServerResponse toUpdate2 (Integer id){
        return gameService.toUpdate(id);
    }

    /**
     * 修改
     */
    @RequestMapping("/updateGame")
    public ServerResponse updateGame(Game game){
        return gameService.updateGame(game);
    }

    /**
     * 查询
     */
    //查询用户数据
    @RequestMapping( "/queryGameList")
    public ServerResponse queryGameList(Game game){
        return gameService.queryGameList(game);
    }


    /**
     * 不带分页的查询
     */
    @RequestMapping("queryGame")
    public ServerResponse queryGame(){
        return gameService.queryGame();
    }

}
