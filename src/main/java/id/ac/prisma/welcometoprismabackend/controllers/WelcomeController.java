package id.ac.prisma.welcometoprismabackend.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = {"/welcome"})
public class WelcomeController {
    @RequestMapping(value = "/welcome", method = RequestMethod.POST, produces = "application/json")
    public Map welcome(@RequestBody Map bodyRequest) {
        String namalengkap = (String) bodyRequest.get("nama lengkap");
        Map response = new HashMap();
        response.put("message", "Welcome to Universitas Prisma " + namalengkap);
        return response;
    }
    @RequestMapping(value = "/semangat", method = RequestMethod.POST, produces = "application/json")
    public Map semangat(@RequestBody Map bodyRequest) {
        String prodi = (String) bodyRequest.get("prodi");
        Map response = new HashMap();
        response.put("message", "Hello selamat pagi juga " + prodi);
        return response;
    }
}
