package gl51.moovie.service.Impl

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MoovieRegistryImplTest extends Specification {

    @Inject
    MoovieRegistryImpl registry // pas l'interface mais l'implémentation car test

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
            registry.addMoovieToFavorite("aaaaa")
        then:
            registry.listFavorite().size() == 1
    }
}
