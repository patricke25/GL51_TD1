package gl51.service

import gl51.data.Picture

interface PictureCloudTransfertService {
    //Transfert les images crées vers le cloud
    int transfert()
}