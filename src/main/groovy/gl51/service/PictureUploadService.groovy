package gl51.service

interface PictureUploadService {
    // Upload les images, les redimensionne, applique le filigrane et met à jour la base de données
    int uploadPicture()
}