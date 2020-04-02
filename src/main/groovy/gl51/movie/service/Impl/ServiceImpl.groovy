package gl51.movie.service.Impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieClient

import javax.inject.Inject

class ServiceImpl {
    @Inject
    MovieClient movieClient

    Movie service(String imdbID){
        movieClient.getMovieDetail(imdbID)
    }

}