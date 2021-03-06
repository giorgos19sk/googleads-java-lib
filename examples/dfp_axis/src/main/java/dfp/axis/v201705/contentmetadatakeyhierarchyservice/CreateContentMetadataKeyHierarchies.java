// Copyright 2015 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package dfp.axis.v201705.contentmetadatakeyhierarchyservice;

import com.beust.jcommander.Parameter;
import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.common.lib.utils.examples.CodeSampleParams;
import com.google.api.ads.dfp.axis.factory.DfpServices;
import com.google.api.ads.dfp.axis.v201705.ContentMetadataKeyHierarchy;
import com.google.api.ads.dfp.axis.v201705.ContentMetadataKeyHierarchyLevel;
import com.google.api.ads.dfp.axis.v201705.ContentMetadataKeyHierarchyServiceInterface;
import com.google.api.ads.dfp.lib.client.DfpSession;
import com.google.api.ads.dfp.lib.utils.examples.ArgumentNames;
import com.google.api.client.auth.oauth2.Credential;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This example creates content metadata key hierarchies. To determine
 * which content metadata key hierarchies exist, run
 * GetAllContentMetadataKeyHierarchies.java.
 *
 * Credentials and properties in {@code fromFile()} are pulled from the
 * "ads.properties" file. See README for more info.
 */
public class CreateContentMetadataKeyHierarchies {

  private static class CreateContentMetadataKeyHierarchiesParams extends CodeSampleParams {
    @Parameter(names = ArgumentNames.HIERARCHY_LEVEL_ONE_KEY_ID, required = true,
        description = "The ID of the custom targeting key for the first level.")
    private Long hierarchyLevelOneKeyId;

    @Parameter(names = ArgumentNames.HIERARCHY_LEVEL_TWO_KEY_ID, required = true,
        description = "The ID of the custom targeting key for the second level.")
    private Long hierarchyLevelTwoKeyId;
  }

  public static void runExample(DfpServices dfpServices, DfpSession session,
      long customTargetingKeyId1, long customTargetingKeyId2) throws Exception {

    // Get the ContentMetadataKeyHierarchy service.
    ContentMetadataKeyHierarchyServiceInterface contentMetadataKeyHierarchyService =
        dfpServices.get(session, ContentMetadataKeyHierarchyServiceInterface.class);

    List<ContentMetadataKeyHierarchyLevel> hierarchyLevels = new ArrayList<>();
    
    ContentMetadataKeyHierarchyLevel hierarchyLevel1 = new ContentMetadataKeyHierarchyLevel();
    hierarchyLevel1.setCustomTargetingKeyId(customTargetingKeyId1);
    hierarchyLevel1.setHierarchyLevel(1);
    hierarchyLevels.add(hierarchyLevel1);
    
    ContentMetadataKeyHierarchyLevel hierarchyLevel2 = new ContentMetadataKeyHierarchyLevel();
    hierarchyLevel2.setCustomTargetingKeyId(customTargetingKeyId2);
    hierarchyLevel2.setHierarchyLevel(2);
    hierarchyLevels.add(hierarchyLevel2);
    
    ContentMetadataKeyHierarchy contentMetadataKeyHierarchy = new ContentMetadataKeyHierarchy();
    contentMetadataKeyHierarchy.setName("Content hierarchy #" + new Random()
        .nextInt(Integer.MAX_VALUE));
    contentMetadataKeyHierarchy.setHierarchyLevels(
        hierarchyLevels.toArray(new ContentMetadataKeyHierarchyLevel[] {}));
    
    // Create the content metadata key hierarchy on the server.
    ContentMetadataKeyHierarchy[] contentMetadataKeyHierarchies = contentMetadataKeyHierarchyService
        .createContentMetadataKeyHierarchies(new ContentMetadataKeyHierarchy[] {
            contentMetadataKeyHierarchy});
    
    for (ContentMetadataKeyHierarchy createdContentMetadataKeyHierarchy : 
        contentMetadataKeyHierarchies) {
      System.out.printf("A content metadata key hierarchy with ID %d, name '%s', and %d "
          + "levels was created.%n", createdContentMetadataKeyHierarchy.getId(), 
          createdContentMetadataKeyHierarchy.getName(),
          createdContentMetadataKeyHierarchy.getHierarchyLevels().length);
    }

  }

  public static void main(String[] args) throws Exception {
    // Generate a refreshable OAuth2 credential.
    Credential oAuth2Credential = new OfflineCredentials.Builder()
        .forApi(Api.DFP)
        .fromFile()
        .build()
        .generateCredential();

    // Construct a DfpSession.
    DfpSession session = new DfpSession.Builder()
        .fromFile()
        .withOAuth2Credential(oAuth2Credential)
        .build();

    DfpServices dfpServices = new DfpServices();

    CreateContentMetadataKeyHierarchiesParams params =
        new CreateContentMetadataKeyHierarchiesParams();
    if (!params.parseArguments(args)) {
      // Either pass the required parameters for this example on the command line, or insert them
      // into the code here. See the parameter class definition above for descriptions.
      params.hierarchyLevelOneKeyId = Long.parseLong("INSERT_HIERARCHY_LEVEL_ONE_KEY_ID_HERE");
      params.hierarchyLevelTwoKeyId = Long.parseLong("INSERT_HIERARCHY_LEVEL_TWO_KEY_ID_HERE");
    }

    runExample(dfpServices, session, params.hierarchyLevelOneKeyId, params.hierarchyLevelTwoKeyId);
  }
}
