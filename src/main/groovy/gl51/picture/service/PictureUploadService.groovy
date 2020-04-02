package gl51.picture.service

interface PictureUploadService {
    // Upload les images, les redimensionne, applique le filigrane et met à jour la base de données
    int uploadPicture()
}