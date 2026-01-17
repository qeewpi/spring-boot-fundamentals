package com.asrmanalo.store.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "user")
    @Builder.Default
    private List<Address> addresses = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "user_tags",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "tag_id")
    )
    @Builder.Default
    private Set<Tag> tags = new HashSet<>();

    @OneToOne(mappedBy = "user")
    private Profile profile;

    @ManyToMany
    @JoinTable(
            name = "wishlist",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private Set<Product> wishlist = new HashSet<>();

    public void setProfile(Profile profile) {
        this.profile = profile;
        profile.setUser(this);
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
        address.setUser(this);
    }

    public void removeAddress(Address address) {
        this.addresses.remove(address);
        address.setUser(null);
    }

    public void addTag(String tagName) {
        var tag = new Tag(tagName);
        this.tags.add(tag);
        tag.getUsers().add(this);
    }

    public void removeTag(String tagName) {
        Iterator<Tag> iterator = this.tags.iterator();

        while (iterator.hasNext()) {
            Tag tag = iterator.next();

            if (tag.getName().equals(tagName)) {
                iterator.remove();

                tag.getUsers().remove(this);
            }
        }
    }
}

