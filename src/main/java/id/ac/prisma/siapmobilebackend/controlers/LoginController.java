package id.ac.prisma.siapmobilebackend.controlers;

public class LoginController {

    String accessToken = "";

    /**
     * fungsi untuk menerima data dari aplikasi mobile
     * untuk kebutuhan login. datanya adalah:
     * email dan password
     * setelah terima data tersebur, selanjutnya di validasi apakah email dan password
     * tersebut valid
     * jika valid maka buatkan  accsessToken, jika tidak kasi response gagal
     */

    public String login(String email, String password) {
        if (email == null) {
            // response gagal email salah
            return null;
        }
        if (email == "") {
            // response gagal email salah
            return null;
        }
        if (password == null) {
            // response gagal
            return null;
        }
        if (password == "") {
            // response gagal
            return null;
        }

        //kita buatkan accesstoken
        String accessToken = "";
        accessToken = "sdasdasda";
        //selesai membuat access token

        //response access token
        return accessToken;
    }
}