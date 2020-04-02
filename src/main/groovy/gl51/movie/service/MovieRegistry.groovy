package gl51.movie.service

import gl51.movie.data.Movie
// shift ctrl T test
// alt entré sur intrface pour implémenter

public interface MovieRegistry {
        void addMovieToFavorite(String imdbid)

        List<Movie> listFavorite()
    }


