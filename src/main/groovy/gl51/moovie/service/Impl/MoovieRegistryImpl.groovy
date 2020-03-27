package gl51.moovie.service.Impl

import gl51.moovie.data.Moovie

import javax.inject.Singleton

@Singleton
class MoovieRegistryImpl implements gl51.moovie.service.MoovieRegistry {

    private List<Moovie> internalRegistry = []

    @Override
    void addMoovieToFavorite(String imdbID) {
        internalRegistry << new Moovie(imdbID: imdbID ) // ajoute a la liste
        // appel a registry
    }

    @Override
    List<Moovie> listFavorite() {
        System.out.println("ee")
        internalRegistry
    }

}
