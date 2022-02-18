package nvc.it.newtonice.repository;

import java.util.List;

import nvc.it.newtonice.model.Camera;

public interface CameraRepository {

    List<Camera> findAll();
    
}
