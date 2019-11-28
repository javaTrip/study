package org.ls.service;

import org.ls.entity.Game;
import org.ls.mapper.GameMapper;
import org.ls.utils.ServerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameMapper gameMapper;

    @Override
    public ServerResponse queryGameList(Game game) {
        //查询出总条数
        long  count=gameMapper.queryCount(game);
        //获取分页数据
        List list=gameMapper.queryUserList(game);
        Map map=new HashMap();
        map.put("draw",game.getDraw());
        map.put("recordsTotal",count);
        map.put("recordsFiltered",count);
        map.put("data",list);
        return ServerResponse.success(map);
    }

    @Override
    public ServerResponse updateGame(Game game) {
          gameMapper.updateGame(game);
          return ServerResponse.success();
    }

    @Override
    public ServerResponse toUpdate(Integer id) {
          Game game=gameMapper.toUpdate(id);
          return ServerResponse.success(game);
    }

    @Override
    public ServerResponse delGame(Integer id) {
           gameMapper.delGame(id);
           return ServerResponse.success();
    }

    @Override
    public ServerResponse addGame(Game game) {
           game.setShowTime(new Date());
           gameMapper.addGame(game);
           return ServerResponse.success();
    }

    @Override
    public ServerResponse queryGame() {
        List<Game>list=gameMapper.queryGame();
        return ServerResponse.success(list);
    }
}
