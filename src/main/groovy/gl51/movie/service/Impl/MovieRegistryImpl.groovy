package gl51.movie.service.Impl

import gl51.movie.data.Movie

import javax.inject.Singleton

@Singleton
class MovieRegistryImpl implements gl51.movie.service.MovieRegistry {

    private List<Movie> internalRegistry = []

    @Override
    void addMovieToFavorite(String imdbID) {
        internalRegistry << new Movie(imdbID: imdbID ) // ajoute a la liste
    }

    @Override
    List<Movie> listFavorite() {
        internalRegistry

    }

}
