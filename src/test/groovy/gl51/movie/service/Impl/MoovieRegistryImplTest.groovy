package gl51.movie.service.Impl

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification
import spock.lang.Unroll

import javax.inject.Inject

@MicronautTest
class MovieRegistryImplTest extends Specification {

    @Inject
    MovieRegistryImpl registry // pas l'interface mais l'implémentation car test


    void "injection should work"(){
        expect:
            registry != null
    }

    void " favorites should be empty"() {
        expect:
        registry.listFavorite() == []
    }

    void "adding a favorite should fill in the database"(){
        when:
            registry.addMovieToFavorite("aaaaa")
        then:
            registry.listFavorite().size() == 1
    }
    // mock qui remplace movie registry
}
