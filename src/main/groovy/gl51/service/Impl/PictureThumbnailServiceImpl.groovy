package gl51.service.Impl

import gl51.data.Picture
import gl51.service.PictureFiligraneService
import gl51.service.PictureService
import gl51.service.PictureThumbnailService

import javax.inject.Inject

class PictureThumbnailServiceImpl implements PictureThumbnailService{
    @Inject PictureService pictureService
    @Inject PictureFiligraneService pictureFiligrane

    @Override
    Picture makeThumbnail(){
        Picture pic = pictureService.fetchPicture()
        //resize pictureFile
        pic.setPictureFile(null)
        pictureFiligrane.apllyFiligrane(pic.getPictureFile())
        pic.setPixels_x(50)
        pic.setPixels_y(50)
        return(pic)
    }
}
