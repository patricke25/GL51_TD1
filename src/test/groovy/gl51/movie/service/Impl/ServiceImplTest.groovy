package gl51.movie.service.Impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieClient
import gl51.movie.service.Impl.ServiceImpl
import spock.lang.Specification
import io.micronaut.test.annotation.MicronautTest

@MicronautTest
class ServiceImplTest extends Specification {

    ServiceImpl movieService= new ServiceImpl()

    void "the client should give details on the selected movie"(){
        when:
            MovieClient movieClient= Mock()
            Movie movie= new Movie()
            movieClient.getMovieDetail("a1") >> movie
            movieService.setMovieClient(movieClient)
        then:
            movieService.service("a1") == movie
    }
}

