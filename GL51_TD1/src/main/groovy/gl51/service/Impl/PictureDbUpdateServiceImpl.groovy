package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureCloudTransfertService
import gl51.service.PictureDbUpdateService
import gl51.service.PictureService

import javax.inject.Inject

@Singleton
class PictureDbUpdateServiceImpl implements PictureDbUpdateService{

    @Inject PictureService pictureService

    @Override
    int updateDb(){
        Picture pic = pictureService.fetchPicture()
        // DbUpdate(pic)
        return 0
    }
}
