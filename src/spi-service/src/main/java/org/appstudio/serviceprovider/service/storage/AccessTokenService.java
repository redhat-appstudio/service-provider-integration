package org.appstudio.serviceprovider.service.storage;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.enterprise.context.ApplicationScoped;
import org.jboss.logging.Logger;

@ApplicationScoped
public class AccessTokenService {
  private static final Logger LOG = Logger.getLogger(AccessTokenService.class);

  private Map<String, AccessToken> tokens = Collections.synchronizedMap(new LinkedHashMap<>());

  public Set<AccessToken> fetchAll() {
    LOG.info("fetchAll");
    return new HashSet<>(tokens.values());
  }

  public Optional<AccessToken> get(String name) {
    LOG.info(name);
    return Optional.ofNullable(tokens.get(name));
  }

  public AccessToken create(AccessToken accessToken) {
    LOG.info(accessToken);
    tokens.put(accessToken.getName(), accessToken);
    return accessToken;
  }

  public void update(String name, AccessToken accessTokenDto) {
    LOG.info(accessTokenDto);
    tokens.replace(name, accessTokenDto);
  }

  public void delete(String name) {
    LOG.info(name);
    tokens.remove(name);
  }
}
