package com.amigoscode.awsimageupload.datastore;

import com.amigoscode.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();
    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("a031ffd9-0d25-4733-8170-154c561598bf"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("521a7aa7-8056-42da-affa-201b6e4058cf"), "antoniojunior", null));
    }
    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
