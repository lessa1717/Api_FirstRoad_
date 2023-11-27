//package apiFirstRoad.apiFirstRoad.models;
//
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import java.io.Serial;
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.List;
//import java.util.UUID;
//
//@Getter
//@Setter
//@Entity
//@Table(name = "tb_TiposUsuario")
//public class TipoUsuario implements Serializable, UserDetails {
//
//    @Serial
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "Id_tipoUsuario", nullable = false)
//    private UUID id_tipoUsuario;
//
//    @Column(name = "tituloTipoUsuario", nullable = false)
//    private String tituloTipoUsuario;
//
//
//
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//
//        if ("AdminMaster".equals(tituloTipoUsuario)) {
//            return List.of(
//                    new SimpleGrantedAuthority("ROLE_ADMIN"),
//                    new SimpleGrantedAuthority("ROLE_GESTOR"),
//                    new SimpleGrantedAuthority("ROLE_COLABORADOR")
//            );
//        } else if ("Gestor".equals(tituloTipoUsuario)) {
//            return List.of(
//                    new SimpleGrantedAuthority("ROLE_GESTOR")
//            );
//        } else if ("Colaborador".equals(tituloTipoUsuario)) {
//            return List.of(
//                    new SimpleGrantedAuthority("ROLE_COLABORADOR")
//            );
//        }
//        return null;
//    }
//
//
//    @Override
//    public String getPassword() {
//        // Se necessário
//        return null;
//    }
//
//    @Override
//    public String getUsername() {
//        // Se necessário
//        return null;
//    }
//
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//}
