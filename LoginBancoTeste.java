package ProjetoMaisComplexos;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginBancoTeste {
    
    @Test
    public void deveAutenticarComCredenciaisCorretas() {
        LoginBanco b1 = new LoginBanco("filipeantonny@gmail.com", "221080643");
        Assertions.assertTrue(b1.autenticarUsuario(), "As credenciais corretas foram aceitas!");
    }
    
    @Test
    public void nãoDeveAutenticarComCredenciaisIncorretas() {
        LoginBanco b1 = new LoginBanco("filipe@gmail.com", "221043");
        Assertions.assertFalse(b1.autenticarUsuario(), "As credenciais incorretas não foram aceitas!");
    }
    
    @Test
    public void nãoDeveautenticarComLoginIncorreto() {
        LoginBanco b1 = new LoginBanco("filipe2002@gmail.com", "221080643");
        Assertions.assertFalse(b1.autenticarUsuario(), "Login incorreto foi detectado!");
    }
    
    @Test
    public void nãoDeveautenticarComSenhaIncorreta() {
        LoginBanco b1 = new LoginBanco("filipeantonny@gmail.com", "2218888888");
        Assertions.assertFalse(b1.autenticarUsuario(), "Senha incorreta foi detectada!");
    }
    
    @Test
    public void nãoDeveautenticarComComLetraMaiuscula() {
        LoginBanco b1 = new LoginBanco("FILIPEANTONNY@gmail.com", "221080643");
        Assertions.assertFalse(b1.autenticarUsuario(), "Login com letra maiúscula foi detectado!");
    }
    
    @Test
    public void nãoDeveautenticarComComLetras() {
        LoginBanco b1 = new LoginBanco("filipeantonny@gmail.com", "221080643lipe");
        Assertions.assertFalse(b1.autenticarUsuario(), "Senha com letras foi detectada!");
    }

    @Test
    public void nãoDeveautenticatComLoginComMenosDe8Caracteres() {
        LoginBanco b1 = new LoginBanco("FILI@", "221080643");
        Assertions.assertFalse(b1.autenticarUsuario(), "Login com menos de 8 caracteres foi detectado!");
    }
    
    @Test
    public void nãoDeveautenticatComSenhaComMenosDe8Caracteres() {
        LoginBanco b1 = new LoginBanco("filipeantonny@gmail.com", "2210");
        Assertions.assertFalse(b1.autenticarUsuario(), "Senha com menos de 8 caracteres foi detectada!");
    }
}
