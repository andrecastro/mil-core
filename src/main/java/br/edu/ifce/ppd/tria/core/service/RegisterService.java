package br.edu.ifce.ppd.tria.core.service;

import br.edu.ifce.ppd.tria.core.model.Client;

/**
 * Created by andrecoelho on 2/18/16.
 */
public interface RegisterService {
    Client register();
    void deregister(Client client);
}
