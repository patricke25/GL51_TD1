package gl51.service.Impl

import gl51.service.PictureCloudTransfertService
import gl51.service.PictureDbUpdateService
import gl51.service.PictureUploadService

import javax.inject.Inject

class PictureUploadServiceImpl implements PictureUploadService{

    @Inject PictureDbUpdateService dbUpdateService
    @Inject PictureCloudTransfertService cloudTransfertService

    @Override
    int uploadPicture(){
        if (dbUpdateService.updateDb()!=0 || cloudTransfertService.transfert() !=0) {
            return 1
        }
        return 0
    }
}
