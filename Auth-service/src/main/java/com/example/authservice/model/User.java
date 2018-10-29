package com.example.authservice.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by Rim vibol
 * Date : 10/27/2018, 2:55 PM
 * Email : vi.rim@gl-f.com
 */

@Entity
@Table(name = "USER_", uniqueConstraints = { @UniqueConstraint(columnNames = { "USER_NAME" }) })
public class User implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long Id;

    @Column(name = "USER_NAME")
    private String Username;

    @Column(name = "PASSWORD")
    private String Password;

    @Column(name = "ACCOUNT_EXPIRED")
    private boolean AccountExpired;

    @Column(name = "ACCOUNT_LOCKED")
    private boolean AccountLocked;

    @Column(name = "CREDENTIALS_EXPIRED")
    private boolean CredentialsExpired;

    @Column(name = "ENABLED")
    private boolean Enabled;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "USERS_AUTHORITIES", joinColumns = @JoinColumn(name = "USER_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID"))
    @OrderBy
    @JsonIgnore
    private Collection<Authority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean isAccountExpired() {
        return AccountExpired;
    }

    public void setAccountExpired(boolean accountExpired) {
        AccountExpired = accountExpired;
    }

    public boolean isAccountLocked() {
        return AccountLocked;
    }

    public void setAccountLocked(boolean accountLocked) {
        AccountLocked = accountLocked;
    }

    public boolean isCredentialsExpired() {
        return CredentialsExpired;
    }

    public void setCredentialsExpired(boolean credentialsExpired) {
        CredentialsExpired = credentialsExpired;
    }

    public void setEnabled(boolean enabled) {
        Enabled = enabled;
    }

    public void setAuthorities(Collection<Authority> authorities) {
        this.authorities = authorities;
    }
}
