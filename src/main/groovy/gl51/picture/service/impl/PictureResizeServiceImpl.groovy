package gl51.picture.service.impl

import gl51.picture.data.Picture
import gl51.picture.service.PictureResizeService
import gl51.picture.service.PictureService

import javax.inject.Inject

class PictureResizeServiceImpl implements PictureResizeService {


    @Inject PictureService pictureService

    @Override
    Picture resize(){
        Picture pic = pictureService.fetchPicture()
        pic.setPixelsX(1024)
        pic.setPixelsY(1024)
        //resize picture file ....
        pic.setPictureFile()
        return pic
    }
}
