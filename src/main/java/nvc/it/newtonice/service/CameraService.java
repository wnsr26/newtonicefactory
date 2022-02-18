package nvc.it.newtonice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nvc.it.newtonice.model.Camera;
import nvc.it.newtonice.repository.CameraRepository;

@Service
public class CameraService {

    @Autowired
    static
    CameraRepository cameraRepository;

    public static List<Camera> findAll() {
        return cameraRepository.findAll();
    }
    
}
