package com.ups.seas.db;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.FirestoreOptions;


public class FireStoreUtil  {

    public FirestoreOptions getFirestoreOptions() throws Exception{
        FirestoreOptions firestoreOptions =
                FirestoreOptions.getDefaultInstance().toBuilder()
                        .setProjectId("seas")
                        .setCredentials(GoogleCredentials.getApplicationDefault())
                        .build();
        return firestoreOptions;
    }




}
