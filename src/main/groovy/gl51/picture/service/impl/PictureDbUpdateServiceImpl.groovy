package gl51.picture.service.impl

import gl51.picture.data.Picture
import gl51.picture.service.PictureDbUpdateService
import gl51.picture.service.PictureService

import javax.inject.Inject

class PictureDbUpdateServiceImpl implements PictureDbUpdateService{

    @Inject PictureService pictureService

    @Override
    int updateDb(){
        Picture pic = pictureService.fetchPicture()
        // DbUpdate(pic)
        return 0
    }
}
