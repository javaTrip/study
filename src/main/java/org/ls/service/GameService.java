package org.ls.service;


import org.ls.entity.Game;
import org.ls.utils.ServerResponse;

public interface GameService {
    ServerResponse queryGameList(Game game);

    ServerResponse updateGame(Game game);

    ServerResponse toUpdate(Integer id);

    ServerResponse delGame(Integer id);

    ServerResponse addGame(Game game);

    ServerResponse queryGame();
}
