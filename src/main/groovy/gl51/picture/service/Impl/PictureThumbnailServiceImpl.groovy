package gl51.picture.service.Impl

import gl51.picture.data.Picture
import gl51.picture.service.PictureFiligraneService
import gl51.picture.service.PictureService
import gl51.picture.service.PictureThumbnailService

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
