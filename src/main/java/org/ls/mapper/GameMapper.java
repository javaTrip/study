package org.ls.mapper;

import org.ls.entity.Game;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;
import java.util.Map;

@MapperScan
public interface GameMapper {
    void addGame(Game game);

    void delGame(Integer id);

    Game toUpdate(Integer id);

    void updateGame(Game game);

    Long queryCount(Game game);

    List<Game> queryUserList(Game game);

    List<Game> queryGame();
}
