package gl51.moovie.service

import gl51.moovie.data.Moovie
// shift ctrl T test
// alt entré sur intrface pour implémenter

public interface MoovieRegistry {
        void addMoovieToFavorite(String imdbid)

        List<Moovie> listFavorite()
    }


