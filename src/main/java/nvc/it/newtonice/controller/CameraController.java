package nvc.it.newtonice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import nvc.it.newtonice.model.Camera;
import nvc.it.newtonice.service.CameraService;

@Controller
@RequestMapping("/camera")
public class CameraController {
    @Autowired
    CameraService cameraService;

   @GetMapping("")
    public ModelAndView camera () {
        List<Camera> cameras = CameraService.findAll();
        return new ModelAndView("camera", "camera", cameras);
    }

    
}
