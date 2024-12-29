package fr.codecake.spotify_clone.catalogcontext.repository;

import fr.codecake.spotify_clone.catalogcontext.domain.Favorite;
import fr.codecake.spotify_clone.catalogcontext.domain.FavoriteId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, FavoriteId> {
}
