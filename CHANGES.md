twilio-java changelog
=====================

[2020-09-16] Version 7.55.2
---------------------------
**Conversations**
- Expose Configuration and Service Configuration resources
- Add Unique Name support for Conversations
- Add Services Push Notification resource
- Add Service scoped Conversation resources
- Support Identity in Users resource endpoint

**Messaging**
- GA Deactivation List API
- Add domain cert API's(fetch, update, create) for link tracker

**Numbers**
- Add API endpoint for Supporting Document deletion

**Proxy**
- Updated usage of FailOnParticipantConflict param to apply only to accounts with ProxyAllowParticipantConflict account flag

**Supersim**
- Add `AccountSid` parameter to Sim resource update request
- Add `ready` status as an available status for a Sim resource


[2020-09-02] Version 7.55.1
---------------------------
**Ai**
- Initial release

**Bulkexports**
- removing public beta feature flag from BulkExports Jobs API

**Messaging**
- Add Deactivation List API
- Added page token parameter for fetch in WhatsApp Templates API

**Numbers**
- Add API endpoint for End User deletion

**Routes**
- Add Resource Route Configurations API
- Add Route Configurations API
- Initial Release

**Trunking**
- Added `transfer_mode` property on Trunks.


[2020-08-19] Version 7.55.0
---------------------------
**Library - Feature**
- [PR #568](https://github.com/twilio/twilio-java/pull/568): add support for custom HTTP headers. Thanks to [@eshanholtz](https://github.com/eshanholtz)!

**Library - Chore**
- [PR #567](https://github.com/twilio/twilio-java/pull/567): drop some of the Guava usage which is easily replaced. Thanks to [@childish-sambino](https://github.com/childish-sambino)!
- [PR #565](https://github.com/twilio/twilio-java/pull/565): update GitHub branch references to use HEAD. Thanks to [@thinkingserious](https://github.com/thinkingserious)!

**Conversations**
- Allow Identity addition to Participants

**Events**
- Sinks API Get all Sinks

**Proxy**
- Clarified usage of FailOnParticipantConflict param as experimental
- Add FailOnParticipantConflict param to Proxy Session create and Proxy Participant create

**Supersim**
- Add fleet, network, and isoCountryCode to the UsageRecords resource
- Change sort order of UsageRecords from ascending to descending with respect to start time field, records are now returned newest to oldest

**Wireless**
- Removed `Start` and `End` parameters from the Data Sessions list endpoint. **(breaking change)**


[2020-08-05] Version 7.54.2
---------------------------
**Messaging**
- Add rejection reason support to WhatsApp API
- Removed status parameter for create and update in WhatsApp Templates API

**Proxy**
- Add FailOnParticipantConflict param to Proxy Session update

**Verify**
- Add `CustomFriendlyName` optional parameter on Verification creation.
- Changes in `Challenge` resource to update documentation of both `details` and `hidden_details` properties.


[2020-07-22] Version 7.54.1
---------------------------
**Library - Fix**
- [PR #558](https://github.com/twilio/twilio-java/pull/558): encode path parameters. Thanks to [@eshanholtz](https://github.com/eshanholtz)!

**Api**
- Add optional Click Tracking and Scheduling parameters to Create action of Message resource

**Supersim**
- Add callback_url and callback_method parameters to Sim resource update request


[2020-07-08] Version 7.54.0
---------------------------
**Library - Feature**
- [PR #555](https://github.com/twilio/twilio-java/pull/555): add fax capability to deserialized phone number capabilities. Thanks to [@childish-sambino](https://github.com/childish-sambino)!
- [PR #553](https://github.com/twilio/twilio-java/pull/553): include API response headers in 'Last Response'. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Library - Chore**
- [PR #554](https://github.com/twilio/twilio-java/pull/554): bump archunit from 0.13.0 to 0.14.1. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #550](https://github.com/twilio/twilio-java/pull/550): bump cobertura-maven-plugin from 2.2 to 2.7. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #551](https://github.com/twilio/twilio-java/pull/551): bump maven-assembly-plugin from 2.3 to 3.3.0. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #543](https://github.com/twilio/twilio-java/pull/543): bump joda-time from 2.5 to 2.10.6. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #545](https://github.com/twilio/twilio-java/pull/545): bump maven-surefire-plugin from 2.20 to 2.22.2. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #546](https://github.com/twilio/twilio-java/pull/546): bump spotbugs-maven-plugin from 3.1.12 to 4.0.4. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #547](https://github.com/twilio/twilio-java/pull/547): bump maven-checkstyle-plugin from 2.17 to 3.1.1. Thanks to [@dependabot](https://github.com/dependabot)!

**Conversations**
- Allow Address updates for Participants
- Message delivery receipts

**Events**
- Add account_sid to subscription and subscribed_events resources

**Flex**
- Changed `wfm_integrations` Flex Configuration key to private **(breaking change)**

**Messaging**
- Add error states to WhatsApp Sender status with failed reason **(breaking change)**
- Delete WhatsApp Template API
- Update WhatsApp Template API
- Add WhatsApp Template Get Api (fetch and read)

**Numbers**
- Add `valid_until` in the Bundles resource
- Add API for Bundle deletion

**Verify**
- Removed support for `sms`, `totp` and `app-push` factor types in Verify push **(breaking change)**


[2020-06-24] Version 7.53.0
---------------------------
**Library - Chore**
- [PR #535](https://github.com/twilio/twilio-java/pull/535): bump maven-javadoc-plugin from 2.10.4 to 3.2.0. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #542](https://github.com/twilio/twilio-java/pull/542): bump guava from 28.0-android to 29.0-android. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #540](https://github.com/twilio/twilio-java/pull/540): bump equalsverifier from 3.1.12 to 3.4.1. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #541](https://github.com/twilio/twilio-java/pull/541): bump junit from 4.11 to 4.13. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #539](https://github.com/twilio/twilio-java/pull/539): bump jjwt.version from 0.10.7 to 0.11.2. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #536](https://github.com/twilio/twilio-java/pull/536): bump jaxb-api from 2.2 to 2.3.1. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #538](https://github.com/twilio/twilio-java/pull/538): bump maven-source-plugin from 3.0.1 to 3.2.1. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #534](https://github.com/twilio/twilio-java/pull/534): add Dependabot. Thanks to [@sullis](https://github.com/sullis)!

**Api**
- Added optional `JitterBufferSize` parameter for creating conference participant
- Added optional `label` property for conference participants
- Added optional parameter `caller_id` for creating conference participant endpoint.

**Autopilot**
- Remove Export resource from Autopilot Assistant

**Conversations**
- Expose Conversation timers

**Monitor**
- Update start/end date filter params to support date-or-time format **(breaking change)**

**Numbers**
- Add `provisionally-approved` as a Supporting Document status

**Preview**
- Removed `Authy` resources. **(breaking change)**

**Supersim**
- Add ready state to the allowed transitions in the sim update call behind the feature flag supersim.ready-state.v1

**Verify**
- Webhook resources added to Verify services and put behind the `api.verify.push` beta feature

**Twiml**
- Add more supported locales for the `Gather` verb.


[2020-06-10] Version 7.52.0
---------------------------
**Library - Docs**
- [PR #533](https://github.com/twilio/twilio-java/pull/533): link to custom HTTP client instructions. Thanks to [@thinkingserious](https://github.com/thinkingserious)!
- [PR #532](https://github.com/twilio/twilio-java/pull/532): link to descriptive exception types. Thanks to [@thinkingserious](https://github.com/thinkingserious)!

**Library - Chore**
- [PR #531](https://github.com/twilio/twilio-java/pull/531): drop the region being passed to each request in the REST object. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Library - Feature**
- [PR #530](https://github.com/twilio/twilio-java/pull/530): add regional and edge support. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Api**
- Added `pstnconnectivity` to `usage_record` API

**Autopilot**
- Add dialogue_sid param to Query list resource

**Notify**
- delivery_callback_url and delivery_callback_enabled added

**Numbers**
- Add `provisionally-approved` as a Bundle status

**Preview**
- `BrandsInformation` endpoint now returns a single `BrandsInformation`
- Deleted phone number required field in the brand phone number endpoint from `kyc-api`
- Removed insights `preview API` from API Definitions **(breaking change)**
- Added `BrandsInformation` endpoint to query brands information stored in KYC

**Supersim**
- Require a Network Access Profile when creating a Fleet **(breaking change)**


[2020-05-27] Version 7.51.0
---------------------------
**Library - Fix**
- [PR #529](https://github.com/twilio/twilio-java/pull/529): Fix datetime filter when the DateTime instances have timezone other than UTC. Thanks to [@adrianboimvaser](https://github.com/adrianboimvaser)!

**Api**
- Added `reason_conference_ended` and `call_sid_ending_conference` to Conference read/fetch/update
- Fixed some examples to use the correct "TK" SID prefix for Trunk resources.

**Authy**
- Renamed `twilio_authy_sandbox_mode` headers to `twilio_sandbox_mode` **(breaking change)**
- Renamed `Twilio-Authy-*` headers to `Twilio-Veriry-*` **(breaking change)**

**Flex**
- Adding `flex_service_instance_sid` to Flex Configuration

**Preview**
- Removed insights preview API from API Definitions **(breaking change)**
- Added `Channels` endpoint to brand a phone number for BrandedCalls

**Serverless**
- Add Build Sid to Log results

**Supersim**
- Add Network Access Profile resource Networks subresource
- Allow specifying a Data Limit on Fleets

**Trunking**
- Fixed some examples to use the correct "TK" SID prefix for Trunk resources.


[2020-05-13] Version 7.50.1
---------------------------
**Library - Chore**
- [PR #526](https://github.com/twilio/twilio-java/pull/526): bump jackson 2.10.4. Thanks to [@sullis](https://github.com/sullis)!

**Api**
- Add optional `emergency_caller_sid` parameter to SIP Domain
- Updated `call_reason` optional property to be treated as PII
- Added optional BYOC Trunk Sid property to Sip Domain API resource

**Autopilot**
- Add Restore resource to Autopilot Assistant

**Contacts**
- Added contacts Create API definition

**Events**
- Subscriptions API initial release

**Numbers**
- Add Evaluations API

**Supersim**
- Allow filtering the Fleets resource by Network Access Profile
- Allow assigning a Network Access Profile when creating and updating a Fleet
- Add Network Access Profiles resource

**Verify**
- Add `CustomCode` optional parameter on Verification creation.
- Add delete action on Service resource.

**Voice**
- Added endpoints for BYOC trunks, SIP connection policies and source IP mappings


[2020-04-29] Version 7.50.0
---------------------------
**Library - Feature**
- [PR #524](https://github.com/twilio/twilio-java/pull/524): add error details to rest and api exceptions. Thanks to [@ashish-s](https://github.com/ashish-s)!

**Preview**
- Added `Dispatch` version to `preview`

**Studio**
- Reroute Create Execution for V2 to the V2 downstream

**Supersim**
- Add Networks resource


[2020-04-15] Version 7.49.1
---------------------------
**Library - Fix**
- [PR #523](https://github.com/twilio/twilio-java/pull/523): adding new constructor. Thanks to [@Salil999](https://github.com/Salil999)!

**Library - Docs**
- [PR #522](https://github.com/twilio/twilio-java/pull/522): instructions on building your own local .jar. Thanks to [@thinkingserious](https://github.com/thinkingserious)!

**Library - Chore**
- [PR #521](https://github.com/twilio/twilio-java/pull/521): remove S3 URLs from test data. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Api**
- Updated description for property `call_reason` in the call create request

**Contacts**
- Added Read, Delete All, and Delete by SID docs
- Initial Release

**Studio**
- Rename `flow_valid` to `flow_validate`
- Removed `errors` and `warnings` from flows error response and added new property named `details`
- Add Update Execution endpoints to v1 and v2 to end execution via API
- Add new `warnings` attribute v2 flow POST api

**Twiml**
- Add enhanced attribute to use with `speech_model` for the `Gather` verb


[2020-04-01] Version 7.49.0
---------------------------
**Library - Fix**
- [PR #520](https://github.com/twilio/twilio-java/pull/520): add exclusions for dependency convergence checks. Thanks to [@eshanholtz](https://github.com/eshanholtz)!

**Api**
- Add optional 'secure' parameter to SIP Domain

**Authy**
- Added an endpoint to list the challenges of a factor
- Added optional parameter `Push` when updating a service to send the service level push factor configuration

**Bulkexports**
- exposing bulk exports (vault/slapchop) API as public beta API

**Flex**
- Adding `queue_stats_configuration` and `wfm_integrations` to Flex Configuration

**Serverless**
- Add Function Version Content endpoint
- Allow build_sid to be optional for deployment requests

**Supersim**
- Remove `deactivated` status for Super SIM which is replaced by `inactive` **(breaking change)**


[2020-03-18] Version 7.48.0
---------------------------
**Library - Chore**
- [PR #519](https://github.com/twilio/twilio-java/pull/519): upgrade jackson to 2.10.3. Thanks to [@sullis](https://github.com/sullis)!

**Library - Fix**
- [PR #502](https://github.com/twilio/twilio-java/pull/502): shut down executorService thread automatically to allow the JVM to shut down gracefully. Thanks to [@Salil999](https://github.com/Salil999)!

**Api**
- Add optional `emergency_calling_enabled` parameter to SIP Domain
- Add optional property `call_reason` in the call create request

**Authy**
- Added `friendly_name` and `config` as optional params to Factor update
- Added `config` param to Factor creation **(breaking change)**

**Preview**
- Renamed `SuccessRate` endpoint to `ImpressionsRate` for Branded Calls (fka. Verified by Twilio) **(breaking change)**


[2020-03-04] Version 7.47.6
---------------------------
**Library - Chore**
- [PR #518](https://github.com/twilio/twilio-java/pull/518): fix JDK Travis failures. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Authy**
- Added the `configuration` property to services to return the service level configurations
- Added optional parameter `Push` when creating a service to send the service level push factor configuration
- Remove FactorStrength support for Factors and Challenges **(breaking change)**

**Messaging**
- Correct the alpha sender capabilities property type **(breaking change)**

**Preview**
- Removed `/Devices` register Branded Calls endpoint, as per iOS sample app deprecation **(breaking change)**
- Removed `Twilio-Sandbox-Mode` request header from the Branded Calls endpoints, as not officially supported **(breaking change)**
- Removed `Verify` version from `preview` subdomain in favor to `verify` subdomain. **(breaking change)**

**Serverless**
- Add UI-Editable field to Services

**Supersim**
- Add `inactive` status for Super SIM which is an alias for `deactivated`

**Taskrouter**
- Adding value range to `priority` in task endpoint

**Verify**
- Fix `SendCodeAttempts` type. It's an array of objects instead of a unique object. **(breaking change)**


[2020-02-19] Version 7.47.5
---------------------------
**Library - Fix**
- [PR #516](https://github.com/twilio/twilio-java/pull/516): Do not include null values in JWT payloads. Thanks to [@thinkingserious](https://github.com/thinkingserious)!

**Api**
- Make call create parameters `async_amd`, `async_amd_status_callback`, and `async_amd_status_callback_method` public
- Add `trunk_sid` as an optional field to Call resource fetch/read responses
- Add property `queue_time` to successful response of create, fetch, and update requests for Call
- Add optional parameter `byoc` to conference participant create.

**Authy**
- Added support for challenges associated to push factors

**Flex**
- Adding `ui_dependencies` to Flex Configuration

**Messaging**
- Deprecate Session API **(breaking change)**

**Numbers**
- Add Regulations API

**Studio**
- Add Execution and Step endpoints to v2 API
- Add webhook_url to Flow response and add new /TestUsers endpoint to v2 API

**Taskrouter**
- Adding `longest_relative_task_age_in_queue` and `longest_relative_task_sid_in_queue` to TaskQueue Real Time Statistics API.
- Add `wait_duration_in_queue_until_accepted` aggregations to TaskQueues Cumulative Statistics endpoint
- Add TaskQueueEnteredDate property to Tasks.

**Video**
- [Composer] Clarification for the composition hooks creation documentation: one source is mandatory, either the `audio_sources` or the `video_layout`, but one of them has to be provided
- [Composer] `audio_sources` type on the composer HTTP POST command, changed from `sid[]` to `string[]` **(breaking change)**
- [Composer] Clarification for the composition creation documentation: one source is mandatory, either the `audio_sources` or the `video_layout`, but one of them has to be provided


[2020-02-05] Version 7.47.4
---------------------------
**Library - Chore**
- [PR #514](https://github.com/twilio/twilio-java/pull/514): Update jjwt dependency version 0.10.7. Thanks to [@eager](https://github.com/eager)!

**Library - Test**
- [PR #506](https://github.com/twilio/twilio-java/pull/506): use [equalsverifier] library to verify 'equals' methods. Thanks to [@sullis](https://github.com/sullis)!

**Api**
- Making content retention and address retention public
- Update `status` enum for Messages to include 'partially_delivered'

**Authy**
- Added support for push factors

**Autopilot**
- Add one new property in Query i.e dialogue_sid

**Verify**
- Add `SendCodeAttempts` to create verification response.

**Video**
- Clarification in composition creation documentation: one source is mandatory, either `audio_sources` or `video_layout`, but on of them has to be provided

**Twiml**
- Add Polly Neural voices.


[2020-01-23] Version 7.47.3
---------------------------
**Library - Docs**
- [PR #510](https://github.com/twilio/twilio-java/pull/510): baseline all the templated markdown docs. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Library - Chore**
- [PR #509](https://github.com/twilio/twilio-java/pull/509): Upgrade archunit to version 0.13.0. Thanks to [@sullis](https://github.com/sullis)!

**Api**
- Add payments public APIs
- Add optional parameter `byoc` to call create request.

**Flex**
- Updating a Flex Flow `creation_on_message` parameter documentation

**Preview**
-
- Removed Verify v2 from preview in favor of its own namespace as GA **(breaking change)**

**Studio**
- Flow definition type update from string to object

**Verify**
- Add `AppHash` parameter when creating a Verification.
- Add `DoNotShareWarningEnabled` parameter to the Service resource.

**Twiml**
- Add `track` attribute to siprec noun.
- Add attribute `byoc` to `<Number>`


[2020-01-08] Version 7.47.2
---------------------------
**Library - Chore**
- [PR #508](https://github.com/twilio/twilio-java/pull/508): update jjwt to v0.9.1. Thanks to [@saksham93](https://github.com/saksham93)!
- [PR #507](https://github.com/twilio/twilio-java/pull/507): upgrade jackson to 2.10.2. Thanks to [@sullis](https://github.com/sullis)!

**Numbers**
- Add Regulatory Compliance CRUD APIs

**Studio**
- Add parameter validation for Studio v2 Flows API

**Twiml**
- Add support for `speech_model` to `Gather` verb


[2019-12-18] Version 7.47.1
---------------------------
**Preview**
- Add `/Insights/SuccessRate` endpoint for Businesses Branded Calls (Verified by Twilio)

**Studio**
- StudioV2 API in beta

**Verify**
- Add `MailerSid` property to Verify Service resource.

**Wireless**
- Added `data_limit_strategy` to Rate Plan resource.


[2019-12-12] Version 7.47.0
---------------------------
**Library**
- [PR #504](https://github.com/twilio/twilio-java/pull/504): feat: add 'order_by' and 'skip_if' parameters in WorkflowRuleTarget. Thanks to [@nikhil-vk](https://github.com/nikhil-vk)!

**Api**
- Make `twiml` conditional for create. One of `url`, `twiml`, or `application_sid` is now required.
- Add `bundle_sid` parameter to /IncomingPhoneNumbers API
- Removed discard / obfuscate parameters from ContentRetention, AddressRetention **(breaking change)**

**Chat**
- Added `last_consumed_message_index` and `last_consumption_timestamp` parameters in update method for UserChannel resource **(breaking change)**

**Conversations**
- Add Participant SID to Message properties

**Messaging**
- Fix incorrectly typed capabilities property for ShortCodes. **(breaking change)**


[2019-12-04] Version 7.46.0
---------------------------
**Library**
- [PR #500](https://github.com/twilio/twilio-java/pull/500): chore: upgrade archunit to version 0.12.0. Thanks to [@sullis](https://github.com/sullis)!
- [PR #499](https://github.com/twilio/twilio-java/pull/499): docs: add supported language versions to README. Thanks to [@childish-sambino](https://github.com/childish-sambino)!
- [PR #489](https://github.com/twilio/twilio-java/pull/489): chore: upgrade jackson to version 2.10.1. Thanks to [@sullis](https://github.com/sullis)!
- [PR #498](https://github.com/twilio/twilio-java/pull/498): fix: Rename child twiml methods to be the tag name and deprecate old methods. Thanks to [@eshanholtz](https://github.com/eshanholtz)!
- [PR #496](https://github.com/twilio/twilio-java/pull/496): docs: add an example for handling exceptions. Thanks to [@childish-sambino](https://github.com/childish-sambino)!
- [PR #494](https://github.com/twilio/twilio-java/pull/494): fix: Add URI encoding for phone numbers. Thanks to [@eshanholtz](https://github.com/eshanholtz)!
- [PR #492](https://github.com/twilio/twilio-java/pull/492): fix: add new Twiml type to deal with constructor overloading issue. Thanks to [@craigsdennis](https://github.com/craigsdennis)!
- [PR #491](https://github.com/twilio/twilio-java/pull/491): Allow missing GPG env vars when running on a fork. Thanks to [@childish-sambino](https://github.com/childish-sambino)!
- [PR #490](https://github.com/twilio/twilio-java/pull/490): docs: add an example using a different HTTP client. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Api**
- Add optional `twiml` parameter for call create

**Chat**
- Added `delete` method in UserChannel resource

**Conversations**
- Allow Messaging Service update

**Taskrouter**
- Support ReEvaluateTasks parameter on Workflow update

**Twiml**
- Remove unsupported `mixed_track` value from `<Stream>` **(breaking change)**
- Add missing fax `<Receive>` optional attributes


[2019-11-13] Version 7.45.1
---------------------------
**Library**
- [PR #487](https://github.com/twilio/twilio-java/pull/487): Bump jackson-databind from 2.9.9.1 to 2.9.10.1. Thanks to [@dependabot](https://github.com/dependabot)!
- [PR #486](https://github.com/twilio/twilio-java/pull/486): add TLS 1.2 warning. Thanks to [@eshanholtz](https://github.com/eshanholtz)!
- [PR #485](https://github.com/twilio/twilio-java/pull/485): Move generated docs to common location. Thanks to [@childish-sambino](https://github.com/childish-sambino)!
- [PR #484](https://github.com/twilio/twilio-java/pull/484): Auto-deploy via Travis CI upon tagged commit to main. Thanks to [@thinkingserious](https://github.com/thinkingserious)!

**Api**
- Make `persistent_action` parameter public
- Add `twiml` optional private parameter for call create

**Autopilot**
- Add Export resource to Autopilot Assistant.

**Flex**
- Added Integration.RetryCount attribute to Flex Flow
- Updating a Flex Flow `channel_type` options documentation

**Insights**
- Added edges to events and metrics
- Added new endpoint definitions for Events and Metrics

**Messaging**
- **create** support for sender registration
- **fetch** support for fetching a sender
- **update** support for sender verification

**Supersim**
- Add `Direction` filter parameter to list commands endpoint
- Allow filtering commands list by Sim Unique Name
- Add `Iccid` filter parameter to list sims endpoint

**Twiml**
- Add support for `<Refer>` verb


[2019-10-31] Version 7.45.0
---------------------------
**Api**
- Add new usage categories to the public api `sms-messages-carrierfees` and `mms-messages-carrierfees`

**Conversations**
- Add ProjectedAddress to Conversations Participant resource

**Preview**
- Implemented different `Sid` for Current Calls (Verified by Twilio), instead of relying in `Call.Sid` from Voice API team **(breaking change)**

**Supersim**
- Add List endpoint to Commands resource for Super Sim Pilot
- Add UsageRecords resource for the Super Sim Pilot
- Add List endpoint to UsageRecords resource for the Super Sim Pilot
- Allow assigning a Sim to a Fleet by Fleet SID or Unique Name for Super SIM Pilot
- Add Update endpoint to Fleets resource for Super Sim Pilot
- Add Fetch endpoint to Commands resource for Super Sim Pilot
- Allow filtering the Sims resource List endpoint by Fleet
- Add List endpoint to Fleets resource for Super Sim Pilot

**Wireless**
- Added `account_sid` to Sim update parameters.

**Twiml**
- Add new locales and voices for `Say` from Polly


[2019-10-16] Version 7.44.0
---------------------------
**Library**
- [PR #483](https://github.com/twilio/twilio-java/pull/483): VIDEO-2338 TrackPriority.STANDARD before GA. Thanks to [@innerverse](https://github.com/innerverse)!
- [PR #482](https://github.com/twilio/twilio-java/pull/482): breaking: Correct video composition date and callback types. Thanks to [@childish-sambino](https://github.com/childish-sambino)! **(breaking change)**

**Api**
- Add new property `attempt` to sms_messages
- Fixed a typo in the documentation for Feedback outcome enum **(breaking change)**
- Update the call price to be optional for deserializing **(breaking change)**

**Flex**
- Added `JanitorEnabled` attribute to Flex Flow
- Change `features_enabled` Flex Configuration key to private **(breaking change)**

**Supersim**
- Add Fetch endpoint to Fleets resource for Super Sim Pilot
- Allow assigning a Sim to a Fleet for Super Sim Pilot
- Add Create endpoint to Fleets resource for Super Sim Pilot

**Twiml**
- Update `<Conference>` rename "whisper" attribute to "coach" **(breaking change)**


[2019-10-02] Version 7.43.1
---------------------------
**Library**
- [PR #481](https://github.com/twilio/twilio-java/pull/481): added request validation for urls with and without ports. Thanks to [@eshanholtz](https://github.com/eshanholtz)!

**Conversations**
- Add media to Conversations Message resource

**Supersim**
- Add List endpoint to Sims resource for Super Sim Pilot


[2019-09-18] Version 7.43.0
----------------------------
**Numbers**
- Add v2 of the Identites API

**Preview**
- Changed authentication method for SDK Trusted Comms endpoints: `/CPS`, `/CurrentCall`, and `/Devices`. Please use `Authorization: Bearer <xCNAM JWT>` **(breaking change)**

**Voice**
- Add Recordings endpoints


[2019-09-04] Version 7.42.0
----------------------------
**Library**
- [PR #480](https://github.com/twilio/twilio-java/pull/480): fix Javadoc copyright year. Thanks to [@sullis](https://github.com/sullis)!
- [PR #478](https://github.com/twilio/twilio-java/pull/478): Upgrade maven-source-plugin to 3.1.0. Thanks to [@sullis](https://github.com/sullis)!
- [PR #479](https://github.com/twilio/twilio-java/pull/479): Upgrade maven-javadoc-plugin to 3.1.1. Thanks to [@sullis](https://github.com/sullis)!
- [PR #471](https://github.com/twilio/twilio-java/pull/471): Catch NPE when creating URI. Thanks to [@pulkitsethi](https://github.com/pulkitsethi)!
- [PR #410](https://github.com/twilio/twilio-java/pull/410): Add jsonToMap in converter. Thanks to [@igracia](https://github.com/igracia)!
- [PR #477](https://github.com/twilio/twilio-java/pull/477): ComplianceTest: resources haveOnlyPrivateConstructors(). Thanks to [@sullis](https://github.com/sullis)!
- [PR #476](https://github.com/twilio/twilio-java/pull/476): Upgrade archunit to version 0.11.0. Thanks to [@sullis](https://github.com/sullis)!

**Api**
-  Pass Twiml in call update request

**Conversations**
- Add attributes to Conversations resources

**Flex**
- Adding `features_enabled` and `serverless_service_sids` to Flex Configuration

**Messaging**
- Message API required params updated **(breaking change)**

**Preview**
- Added support for the optional `CallSid` to `/BrandedCalls` endpoint


[2019-08-21] Version 7.41.2
----------------------------
**Library**
- [PR #475](https://github.com/twilio/twilio-java/pull/475): Update the Flex domain name to be 'flex-api'. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Conversations**
- Add Chat Conversation SID to conversation default output properties

**Flex**
- Adding `outbound_call_flows` object to Flex Configuration
- Adding read and fetch to channels API

**Supersim**
- Add Sims and Commands resources for the Super Sim Pilot

**Sync**
- Added configuration option for enabling webhooks from REST.

**Wireless**
- Added `usage_notification_method` and `usage_notification_url` properties to `rate_plan`.

**Twiml**
- Add support for `ach-debit` transactions in `Pay` verb


[2019-08-05] Version 7.41.1
----------------------------
**Library**
- [PR #472](https://github.com/twilio/twilio-java/pull/472): add [Sean Sullivan] to authors document. Thanks to [@sullis](https://github.com/sullis)!

**Preview**
- Added support for the header `Twilio-Sandbox-Mode` to mock all Voice dependencies

**Twiml**
- Add support for `<Siprec>` noun
- Add support for `<Stream>` noun
- Create verbs `<Start>` and `<Stop>`


[2019-07-31] Version 7.41.0
----------------------------
**Library**
- [PR #473](https://github.com/twilio/twilio-java/pull/473): Security vulnerability fix by updating jackson-databind version to 2.9.9.1. Thanks to [@krantitalluri](https://github.com/krantitalluri)!

**Insights**
- Added `properties` to summary.

**Preview**
- Added endpoint to brand a call without initiating it, so it can be initiated manually by the Customer

**Twiml**
- Update `<Conference>` recording events **(breaking change)**


[2019-07-10] Version 7.40.1
----------------------------
**Library**
- [PR #459](https://github.com/twilio/twilio-java/pull/459): Update library dependencies. Thanks to [@duttonw](https://github.com/duttonw)!
- [PR #469](https://github.com/twilio/twilio-java/pull/469): Add urls property in ice servers. Thanks to [@FMV1491](https://github.com/FMV1491)!
- [PR #467](https://github.com/twilio/twilio-java/pull/467): Remove VS Code settings. Thanks to [@thinkingserious](https://github.com/thinkingserious)!
- [PR #465](https://github.com/twilio/twilio-java/pull/465): Replace commons codec. Thanks to [@jasonsoooz](https://github.com/jasonsoooz)!
- [PR #466](https://github.com/twilio/twilio-java/pull/466): Ignore local settings. Thanks to [@thinkingserious](https://github.com/thinkingserious)!

**Api**
- Make `friendly_name` optional for applications create
- Add new property `as_of` date to Usage Record API calls

**Wireless**
- Added Usage Records resource.


[2019-06-26] Version 7.40.0
----------------------------
**Library**
- [PR #464](https://github.com/twilio/twilio-java/pull/464): Add [archunit] rules. Thanks to [@sullis](https://github.com/sullis)!

**Autopilot**
- Adds two new properties in Assistant i.e needs_model_build and development_stage

**Preview**
- Changed phone numbers from _URL|Path_ to `X-XCNAM-Sensitive` headers **(breaking change)**

**Verify**
- Add `MessagingConfiguration` resource to verify service


[2019-06-12] Version 7.39.0
----------------------------
**Autopilot**
- Add Webhooks resource to Autopilot Assistant.

**Flex**
- Added missing 'custom' type to Flex Flow
- Adding `integrations` to Flex Configuration

**Insights**
- Added attributes to summary.

**Messaging**
- Message API Create updated with conditional params **(breaking change)**

**Proxy**
- Document that Proxy will return a maximum of 100 records for read/list endpoints **(breaking change)**
- Remove non-updatable property parameters for Session update (mode, participants) **(breaking change)**

**Sync**
- Added reachability debouncing configuration options.

**Verify**
- Add `RateLimits` and `Buckets` resources to Verify Services
- Add `RateLimits` optional parameter on `Verification` creation.

**Twiml**
- Fix `<Room>` participantIdentity casing


[2019-05-29] Version 7.38.1
----------------------------
**Library**
- [PR #461](https://github.com/twilio/twilio-java/pull/461): Add SubscribeRule and SubscribeRulesUpdate. Thanks to [@innerverse](https://github.com/innerverse)!
- [PR #456](https://github.com/twilio/twilio-java/pull/456): Code cleanup. Thanks to [@ethanwood17](https://github.com/ethanwood17)!
- [PR #444](https://github.com/twilio/twilio-java/pull/444): maven-compiler-plugin 3.8.0. Thanks to [@sullis](https://github.com/sullis)!
- [PR #460](https://github.com/twilio/twilio-java/pull/460): jackson 2.9.9. Thanks to [@sullis](https://github.com/sullis)!
- [PR #457](https://github.com/twilio/twilio-java/pull/457): Update the call create 'from' param to be endpoint type for client identifier support. Thanks to [@childish-sambino](https://github.com/childish-sambino)!
- [PR #458](https://github.com/twilio/twilio-java/pull/458): Prefix client identifiers with 'client:' if not already prefixed. Thanks to [@childish-sambino](https://github.com/childish-sambino)!

**Verify**
- Add `approved` to status enum


[2019-05-15] Version 7.38.0
----------------------------
**Api**
- Make `method` optional for queue members update

**Chat**
- Removed `webhook.*.format` update parameters in Service resource from public library visibility in v1 **(breaking change)**

**Insights**
- Added client metrics as sdk_edge to summary.
- Added optional query param processing_state.

**Numbers**
- Add addtional metadata fields on a Document
- Add status callback fields and parameters

**Taskrouter**
- Added `channel_optimized_routing` attribute to task-channel endpoint

**Video**
- [Rooms] Add Video Subscription API

**Wireless**
- Added `imei` to Data Session resource.
- Remove `imeisv` from Data Session resource. **(breaking change)**


[2019-05-01] Version 7.37.4
----------------------------
**Serverless**
- Documentation

**Wireless**
- Added `imeisv` to Data Session resource.


[2019-04-24] Version 7.37.3
----------------------------
**Api**
- Add `verified` property to Addresses

**Numbers**
- Add API for Identites and documents

**Proxy**
- Add in use count on number instance


[2019-04-12] Version 7.37.2
----------------------------
**Serverless**
- Serverless scaffolding


[2019-04-12] Version 7.37.1
----------------------------
**Library**
- PR #454: Add more JDK versions to Travis CI config. Thanks to @childish-sambino!
- PR #453: Bump JMockit version for minimum compatibility with Java 11. Thanks to @childish-sambino!

**Flex**
- Adding PluginService to Flex Configuration

**Numbers**
- Add API for Proof of Addresses

**Proxy**
- Clarify documentation for Service and Session fetch


[2019-03-28] Version 7.37.0
----------------------------
**Api**
- Remove optional `if_machine` call create parameter from helper libraries **(breaking change)**
- Changed `call_sid` path parameter type on QueueMember fetch and update requests **(breaking change)**

**Voice**
- changed file names to dialing_permissions prefix **(breaking change)**

**Wireless**
- Added `ResetStatus` property to Sim resource to allow resetting connectivity via the API.


[2019-03-15] Version 7.36.2
----------------------------
**Library**
- PR #452: Add Help Center and Support Ticket links to the README. Thanks to @childish-sambino!

**Api**
- Add `machine_detection_speech_threshold`, `machine_detection_speech_end_threshold`, `machine_detection_silence_timeout` optional params to Call create request

**Flex**
- Adding Flex Channel Orchestration
- Adding Flex Flow


[2019-03-06] Version 7.36.1
----------------------------
**Twiml**
- Add `de1` to `<Conference>` regions


[2019-03-01] Version 7.36.0
----------------------------
**Api**
- Make conference participant preview parameters public

**Authy**
- Added support for FactorType and FactorStrength for Factors and Challenges

**Iam**
- First public release

**Verify**
- Add endpoint to update/cancel a Verification **(breaking change)**

**Video**
- [Composer] Make RoomSid mandatory **(breaking change)**
- [Composer] Add `enqueued` state to Composition

**Twiml**
- Update message body to not be required for TwiML `Dial` noun.


[2019-02-15] Version 7.35.1
----------------------------
**Library**
- PR #449: Allow POST requests that are void of a body or any params when using the ValidationClient. Thanks to @childish-sambino!

**Api**
- Add `force_opt_in` optional param to Messages create request
- Add agent conference category to usage records

**Flex**
- First public release

**Taskrouter**
- Adding `reject_pending_reservations` to worker update endpoint
- Added `event_date_ms` and `worker_time_in_previous_activity_ms` to Events API response
- Add ability to filter events by TaskChannel

**Verify**
- Add `EnablePsd2` optional parameter for PSD2 on Service resource creation or update.
- Add `Amount`, `Payee` optional parameters for PSD2.


[2019-02-04] Version 7.35.0
----------------------------
**Library**
- PR #448: Switch body validator to use hex instead of base64. Thanks to @cjcodes!
- PR #447: Upgrade jackson library to 2.9.8. Thanks to @mbichoffe!

**Video**
- [Recordings] Add media type filter to list operation
- [Composer] Filter Composition Hook resources by FriendlyName

**Twiml**
- Update `language` enum for `Gather` to fix language code for Filipino (Philippines) and include additional supported languages **(breaking change)**


[2019-01-11] Version 7.34.1
----------------------------
**Verify**
- Add `lookup` information in the response when creating a new verification (depends on the LookupEnabled flag being enabled at the service level)
- Add `VerificationSid` optional parameter on Verification check.


[2019-01-10] Version 7.34.0
----------------------------
**Chat**
- Mark Member attributes as PII

**Proxy**
- Remove unsupported query parameters **(breaking change)**
- Remove invalid session statuses in doc


[2019-01-02] Version 7.33.1
----------------------------
**Insights**
- Initial revision.


[2018-12-14] Version 7.33.0
----------------------------
**Authy**
- Reverted the change to `FactorType` and `FormType`, avoiding conflicts with Helper Libraries reserved words (`type`) **(breaking change)**

**Proxy**
- Remove incorrect parameter for Session List

**Studio**
- Support date created filtering on list of executions

**Taskrouter**
- Adding ability to Create, Modify and Delete Task Channels.

**Verify**
- Add `SkipSmsToLandlines`, `TtsName`, `DtmfInputRequired` optional parameters on Service resource creation or update.

**Wireless**
- Added delete action on Command resource.
- Added delete action on Sim resource.

**Twiml**
- Change `currency` from enum to string for `Pay` **(breaking change)**


[2018-11-30] Version 7.32.0
----------------------------
**Library**
- PR #445: Bump httpclient httpcore and jackson version. Thanks to @yannieyip!

**Api**
- Add `interactive_data` optional param to Messages create request

**Authy**
- Required authentication for `/v1/Forms/{type}` endpoint **(breaking change)**
- Removed `Challenge.reason` to `Challenge.responded_reason`
- Removed `verification_sid` from Challenge responses
- Removed `config` param from the Factor creation
- Replaced all occurrences of `FactorType` and `FormType` in favor of a unified `Type` **(breaking change)**

**Chat**
- Add Member attributes

**Preview**
- Removed `Authy` version from `preview` subdomain in favor to `authy` subdomain. **(breaking change)**

**Verify**
- Add `CustomCode` optional parameter on Verication creation.


[2018-11-16] Version 7.31.0
----------------------------
**Messaging**
- Session API

**Twiml**
- Change `master-card` to `mastercard` as `cardType` for `Pay` and `Prompt`, remove attribute `credential_sid` from `Pay` **(breaking change)**


[2018-10-28] Version 7.30.0
----------------------------
**Api**
- Add new Balance resource:
    - url: '/v1/Accounts/{account sid}/Balance'
    - supported methods: GET
    - returns the balance of the account

**Proxy**
- Add chat_instance_sid to Service

**Verify**
- Add `Locale` optional parameter on Verification creation.


[2018-10-15] Version 7.29.0
----------------------------
**Api**
- Add <Pay> Verb Transactions category to usage records

**Twiml**
- Add support for `Pay` verb


[2018-10-15] Version 7.28.0
----------------------------
**Library**
- PR #440: CLIENT-4598 | Fix null incomingAllow bug and add test. Thanks to @ryan-rowland!

**Api**
- Add `coaching` and `call_sid_to_coach` to participant properties, create and update requests.

**Authy**
- Set public library visibility, and added PII stanza
- Dropped support for `FactorType` param given new Factor prefixes **(breaking change)**
- Supported `DELETE` actions for Authy resources
- Move Authy Services resources to `authy` subdomain

**Autopilot**
- Introduce `autopilot` subdomain with all resources from `preview.understand`

**Preview**
- Renamed Understand intent to task **(breaking change)**
- Deprecated Authy endpoints from `preview` to `authy` subdomain

**Taskrouter**
- Allow TaskQueue ReservationActivitySid and AssignmentActivitySid to not be configured for MultiTask Workspaces

**Verify**
- Add `LookupEnabled` optional parameter on Service resource creation or update.
- Add `SendDigits` optional parameter on Verification creation.
- Add delete action on Service resourse.

**Twiml**
- Add custom parameters to TwiML `Client` noun and renamed the optional `name` field to `identity`. This is a breaking change in Ruby, and applications will need to transition from `dial.client ''` and `dial.client 'alice'` formats to `dial.client` and `dial.client(identity: alice)` formats. **(breaking change)**


[2018-10-04] Version 7.27.0
----------------------------
**Library**
- PR #439: Nest IOException inside APIException. Thanks to @yannieyip!

**Twiml**
- Add `debug` to `Gather`
- Add `participantIdentity` to `Room`


[2018-09-28] Version 7.26.0
----------------------------
**Api**
- Set `call_sid_to_coach` parameter in participant to be `preview`

**Preview**
- Renamed response headers for Challenge and Factors Signatures
- Supported `totp` in Authy preview endpoints
- Allowed `latest` in Authy Challenges endpoints

**Video**
- [Composer] Add Composition Hook resources

**Voice**
- changed path param name from parent_iso_code to iso_code for highrisk_special_prefixes api **(breaking change)**
- added geo permissions public api


[2018-09-20] Version 7.25.0
----------------------------
**Preview**
- Add `Form` resource to Authy preview given a `form_type`
- Add Authy initial api-definitions in the 4 main resources: Services, Entities, Factors, Challenges

**Pricing**
- add voice_numbers resource (v2)

**Verify**
- Move from preview to beta **(breaking change)**


[2018-08-31] Version 7.24.2
----------------------------
**Library**
- PR #438:  VCORE-3651 Add support for *for* attribute in twiml element. Thanks to @nmahure!

**Api**
- Add `call_sid_to_coach` parameter to participant create request
- Add `voice_receive_mode` param to IncomingPhoneNumbers create

**Video**
- [Recordings] Expose `offset` property in resource


[2018-08-23] Version 7.24.1
----------------------------
**Library**
- PR #436: Create new class, OutboundCallPriceWithOrigin. Thanks to @jbonner89!

**Chat**
- Add User Channel instance resource


[2018-08-17] Version 7.24.0
----------------------------
**Library**
- PR #434:  add type OutboundPrefixPriceWithOrigin. Thanks to @jbonner89!

**Api**
- Add Proxy Active Sessions category to usage records

**Preview**
- Add `Actions` endpoints and remove `ResponseUrl` from assistants on the Understand api

**Pricing**
- add voice_country resource (v2)


[2018-08-09] Version 7.23.1
----------------------------
**Preview**
- Add new Intent Statistics endpoint
- Remove `ttl` from Assistants

**Studio**
- Studio is now GA


[2018-08-03] Version 7.23.0
----------------------------
**Library**
- PR #426: Tag and push Docker latest image when deploying with TravisCI. Thanks to @jonatasbaldin!

**Chat**
- Make message From field updatable
- Add REST API webhooks

**Notify**
- Removing deprecated `segments`, `users`, `segment_memberships`, `user_bindings` classes from helper libraries. **(breaking change)**

**Twiml**
- Add `Connect` and `Room` for Programmable Video Rooms


[2018-07-27] Version 7.22.2
----------------------------
**Library**
- PR #433: Clone the headers object and add test for thread safety. Thanks to @cjcodes!


[2018-07-26] Version 7.22.1
----------------------------
**Api**
- Add support for sip domains to map credential lists for registrations

**Preview**
- Remove `ttl` from Assistants

**Proxy**
- Enable setting a proxy number as reserved

**Video**
- Add `group-small` room type

**Twiml**
- Add support for SSML lang tag on Say verb


[2018-07-16] Version 7.22.0
----------------------------
**Library**
- PR #427: Update Response to use Scanner hasNext(). Thanks to @cjcodes!
- PR #424: Add a method for validation of JSON body. Thanks to @cjcodes!

**Twiml**
- Add support for SSML on Say verb, the message body is changed to be optional **(breaking change)**


[2018-07-11] Version 7.21.8
----------------------------
**Library**
- PR #425: Add correct JDK version statement to deploy. Thanks to @jonatasbaldin!

**Api**
- Add `cidr_prefix_length` param to SIP IpAddresses API

**Studio**
- Add new /Execution endpoints to begin Engagement -> Execution migration

**Video**
- [Rooms] Allow deletion of individual recordings from a room


[2018-07-05] Version 7.21.7
----------------------------
**Library**
- PR #418: Add Dockerfile and related changes to build the Docker image. Thanks to @jonatasbaldin!

**Api**
- Release `Call Recording Controls` feature support in helper libraries
- Add Voice Insights sub-category keys to usage records


[2018-06-29] Version 7.21.6
----------------------------
**Library**
- PR #421: Tests for mixed TwiML content. Thanks to @ekarson!
- PR #420: Update tests with generated version. Thanks to @mbichoffe!
- PR #419: Allow adding TwiML children with generic tag names. Thanks to @mbichoffe!


[2018-06-21] Version 7.21.5
----------------------------
**Api**
- Add Fraud Lookups category to usage records

**Video**
- Allow user to set `ContentDisposition` when obtaining media URLs for Room Recordings and Compositions
- Add Composition Settings resource


[2018-06-15] Version 7.21.4
----------------------------
**Library**
- PR #416: Allow adding text nodes under any TwiML element. Thanks to @ekarson!
- PR #414: Convenience method for verifying your connection with the new SSL certificate. Thanks to @ekarson!

**Twiml**
- Add methods to helper libraries to inject arbitrary text under a TwiML node


[2018-06-04] Version 7.21.3
----------------------------
**Lookups**
- Add back support for `fraud` lookup type


[2018-05-29] Version 7.21.2
----------------------------
**Chat**
- Add Binding and UserBinding documentation

**Studio**
- Add endpoint to delete engagements

**Trunking**
- Added cnam_lookup_enabled parameter to Trunk resource.
- Added case-insensitivity for recording parameter to Trunk resource.


[2018-05-18] Version 7.21.1
----------------------------
**Api**
- Add more programmable video categories to usage records
- Add 'include_subaccounts' parameter to all variation of usage_record fetch


[2018-05-11] Version 7.21.0
----------------------------
**Library**
- PR #411: Update Jackson to version 2.8.11. Thanks to @jmctwilio!

**Chat**
- Add Channel Webhooks resource

**Monitor**
- Update event filtering to support date/time **(breaking change)**

**Wireless**
- Updated `maturity` to `ga` for all wireless apis


[2018-04-28] Version 7.20.0
----------------------------
**Library**
- PR #408: Strip default ports in RequestCanonicalizer. Thanks to @pkiv!

**Video**
- Redesign API by adding custom `VideoLayout` object. **(breaking change)**


[2018-04-20] Version 7.19.1
----------------------------
**Twiml**
- Gather input Enum: remove unnecessary "dtmf speech" value as you can now specify multiple enum values for this parameter and both "dtmf" and "speech" are already available.


[2018-04-13] Version 7.19.0
----------------------------
**Library**
- PR #404: Add incoming.allow to AccessToken VoiceGrant. Thanks to @ryan-rowland!

**Preview**
- Support for Understand V2 APIs - renames various resources and adds new fields

**Studio**
- Change parameters type from string to object in engagement resource

**Video**
- [Recordings] Change `size` type to `long`. **(breaking change)**


[2018-03-22] Version 7.18.0
----------------------------
**Lookups**
- Disable support for `fraud` lookups *(breaking change)*

**Preview**
- Add `BuildDuration` and `ErrorCode` to Understand ModelBuild

**Studio**
- Add new /Context endpoint for step and engagement resources.


[2018-03-12] Version 7.17.9
----------------------------
**Api**
- Add `caller_id` param to Outbound Calls API
- Release `trim` recording Outbound Calls API functionality in helper libraries

**Video**
- [composer] Add `room_sid` to Composition resource.


[2018-02-23] Version 7.17.8
----------------------------
**Api**
- Add `trim` param to Outbound Calls API

**Lookups**
- Add support for `fraud` lookup type

**Numbers**
- Initial Release

**Video**
- [composer] Add `SEQUENCE` value to available layouts, and `trim` and `reuse` params.


[2018-02-09] Version 7.17.7
----------------------------
**Api**
- Add `AnnounceUrl` and `AnnounceMethod` params for conference announce

**Chat**
- Add support to looking up user channels by identity in v1


[2018-01-30] Version 7.17.6
----------------------------
**Api**
- Add `studio-engagements` usage key

**Preview**
- Remove Studio Engagement Deletion

**Studio**
- Initial Release

**Video**
- [omit] Beta: Allow updates to `SubscribedTracks`.
- Add `SubscribedTracks`.
- Add track name to Video Recording resource
- Add Composition and Composition Media resources


[2018-01-22] Version 7.17.1
----------------------------
**Api**
- Add `conference_sid` property on Recordings
- Add proxy and sms usage key

**Chat**
- Make user channels accessible by identity
- Add notifications logs flag parameter

**Fax**
- Added `ttl` parameter
  `ttl` is the number of minutes a fax is considered valid.

**Preview**
- Add `call_delay`, `extension`, `verification_code`, and `verification_call_sids`.
- Add `failure_reason` to HostedNumberOrders.
- Add DependentHostedNumberOrders endpoint for AuthorizationDocuments preview API.


[2017-12-15] Version 7.17.0
----------------------------
**Library**
- Autogenerate TwiML Resources *(breaking change)*.
- Improved consistency between TwiML classes and faster updates.
- Allow setting arbitrary attributes on any TwiML resource.
- Use proper Java types in TwiML resources *(breaking change)*.
- Restructure TwiML package *(breaking change)*.

**Api**
- Add `voip`, `national`, `shared_cost`, and `machine_to_machine` sub-resources to `/2010-04-01/Accounts/{AccountSid}/AvailablePhoneNumbers/{IsoCountryCode}/`
- Add programmable video keys

**Preview**
- Add `verification_type` and `verification_document_sid` to HostedNumberOrders.

**Proxy**
- Fixed typo in session status enum value


[2017-12-01] Version 7.16.1
----------------------------
**Api**
- Use the correct properties for Dependent Phone Numbers of an Address *(breaking change)*
- Update Call Recordings with the correct properties

**Preview**
- Add `status` and `email` query param filters for AuthorizationDocument list endpoint

**Proxy**
- Added DELETE support to Interaction
- Standardized enum values to dash-case
- Rename Service#friendly_name to Service#unique_name

**Video**
- Remove beta flag from `media_region` and `video_codecs`

**Wireless**
- Bug fix: Changed `operator_mcc` and `operator_mnc` in `DataSessions` subresource from `integer` to `string`


[2017-11-17] Version 7.16.0
----------------------------
**Sync**
- Add TTL support for Sync objects *(breaking change)*
  - The required `data` parameter on the following actions is now optional: "Update Document", "Update Map Item", "Update List Item"
  - New actions available for updating TTL of Sync objects: "Update List", "Update Map", "Update Stream"

**Video**
- [bi] Rename `RoomParticipant` to `Participant`
- Add Recording Settings resource
- Expose EncryptionKey and MediaExternalLocation properties in Recording resource


[2017-11-10] Version 7.15.6
----------------------------
**Accounts**
- Add AWS credential type

**Preview**
- Removed `iso_country` as required field for creating a HostedNumberOrder.

**Proxy**
- Added new fields to Service: geo_match_level, number_selection_behavior, intercept_callback_url, out_of_session_callback_url


[2017-11-03] Version 7.15.5
----------------------------
**Api**
- Add programmable video keys

**Video**
- Add `Participants`


[2017-10-27] Version 7.15.4
----------------------------
**Chat**
- Add Binding resource
- Add UserBinding resource


[2017-10-20] Version 7.15.3
----------------------------
**Api**
- Add `address_sid` param to IncomingPhoneNumbers create and update
- Add 'fax_enabled' option for Phone Number Search


[2017-10-13] Version 7.15.2
----------------------------
**Api**
- Add `smart_encoded` param for Messages
- Add `identity_sid` param to IncomingPhoneNumbers create and update

**Preview**
- Make 'address_sid' and 'email' optional fields when creating a HostedNumberOrder
- Add AuthorizationDocuments preview API.

**Proxy**
- Initial Release

**Wireless**
- Added `ip_address` to sim resource


[2017-10-06] Version 7.15.1
----------------------------
**Preview**
- Add `acc_security` (authy-phone-verification) initial api

**Taskrouter**
- Less verbose naming of cumulative and real time statistics *(breaking change)*


[2017-09-29] Version 7.15.0
----------------------------
**Chat**
- Make member accessible through identity
- Make channel subresources accessible by channel unique name
- Set get list 'max_page_size' parameter to 100
- Add service instance webhook retry configuration
- Add media message capability
- Make `body` an optional parameter on Message creation. *(breaking change)*

**Notify**
- `data`, `apn`, `gcm`, `fcm`, `sms` parameters in `Notifications` create resource are maps instead of strings. *(breaking change)*

**Taskrouter**
- Add new query ability by TaskChannelSid or TaskChannelUniqueName
- Move Events, Worker, Workers endpoint over to CPR
- Add new RealTime and Cumulative Statistics endpoints

**Video**
- Create should allow an array of video_codecs.
- Add video_codecs as a property of room to make it externally visible.


[2017-09-15] Version 7.14.6
----------------------------

- Add speechTimeout to Gather verb.

**Api**
- Add `sip_registration` property on SIP Domains
- Add new video and market usage category keys


[2017-09-01] Version 7.14.5
----------------------------
**Sync**
- Add support for Streams

**Wireless**
- Added DataSessions sub-resource to Sims.


[2017-08-25] Version 7.14.4
----------------------------
**Video**
- New `media_region` parameter when creating a room, which controls which region media will be served out of.


[2017-08-22] Version 7.14.3
----------------------------
**Library**
- Add `getLastRequest` and `getLastResponse` methods to HttpClient class to provide debugging information.

**Api**
- Update `status` enum for Recordings to include 'failed'
- Add `error_code` property on Recordings

**Chat**
- Add mutable parameters for channel, members and messages


[2017-08-18] Version 7.14.2
----------------------------
**Api**
- Add VoiceReceiveMode {'voice', 'fax'} option to IncomingPhoneNumber UPDATE requests

**Chat**
- Add channel message media information
- Add service instance message media information

**Preview**
- Add DeployedDevices.

**Sync**
- Add support for Service Instance unique names


[2017-08-11] Version 7.14.1
----------------------------
**Api**
- Add New wireless usage keys added
- Add `auto_correct_address` param for Addresses create and update
- Add .hashCode(), .equals(), and .toString() methods

**Preview**
- Removed 'email' from bulk_exports configuration api [bi]. No migration plan needed because api has not been used yet.
- Add AvailableNumbers resource.

**Video**
- Add `video_codec` enum and `video_codecs` parameter, which can be set to either `VP8` or `H264` during room creation.
- Restrict recordings page size to 100
- Add query parameters `SourceSid`, `Status`, `DateCreatedAfter` and `DateCreatedBefore` to the convenience method for retrieving Room recordings.


[2017-07-27] Version 7.14.0
----------------------------
This release adds Beta and Preview products to main artifact.

Previously, Beta and Preview products were only included in the `alpha`
artifact. They are now being included in the main artifact to ease product
discoverability and the collective operational overhead of maintaining multiple
artifacts per library.

**Api**
- Remove unused `encryption_type` property on Recordings *(breaking change)*

**Messaging**
- Fix incorrectly typed capabilities property for PhoneNumbers.

**Notify**
- Add `ToBinding` optional parameter on Notifications resource creation. Accepted values are json strings.

**Preview**
- Add `sms_application_sid` to HostedNumberOrders.

**Taskrouter**
- Fully support conference functionality in reservations.


[2017-07-19] Version 7.13.1
----------------------------
**Api**
- Update `status` enum for Messages to include 'accepted'

[2017-07-12] Version 7.13.0
----------------------------
- Change git tagging scheme to be consistent with other twilio libraries.
- Fix crashes on Google App Engine when using default NetworkHttpClient. Issue #377. Thanks to @katafractari for helping identify the bug and test the fix.

**Api**
- Fix incorrectly named `AnnounceUrlMethod` to `AnnounceMethod` parameter naming on Conference Participant Updating.
- Add `encryptionType` and `encryptionDetails` support to Call Recordings.
- Add new UsageRecord categories for Rooms and Speech Recognition.

**Notify**
- Add `ToBinding` optional parameter on Notifications resource creation. Accepted values are json strings.

**Preview**
- Add `verificationAttempts` to HostedNumberOrders.
- Add `statusCallbackUrl` and `statusCallbackMethod` to HostedNumberOrders.

**Video**
- Filter recordings by date using the parameters `DateCreatedAfter` and `DateCreatedBefore`.
- Override the default time-to-live of a recording's media URL through the `Ttl` parameter (in seconds, default value is 3600).
- Add query parameters `SourceSid`, `Status`, `DateCreatedAfter` and `DateCreatedBefore` to the convenience method for retrieving Room recordings.

**Wireless**
- Added national and international data limits to the RatePlans resource.


[2017-06-16] Version 7.12.0
--------------------------
- Remove client-side max page size validation.
- Add `locality` field to `AvailablePhoneNumbers`.
- Add `origin` field to `IncomingPhoneNumbers`.
- Add `inLocality` parameter to `AvailablePhoneNumbers`.
- Add `origin` parameter to `IncomingPhoneNumbers`.
- Add new sync categories to `UsageRecords`.
- Add `getPage()` method for reentrant paging.
- Add `input` to `<Gather>`.
- Remove mandatory url parameter in `<Play>`.
- Parallelize tests.
- Update `Language` enum.

[2017-05-24] Version 7.11.0
--------------------------
- Rename `Recording` to `RoomRecording` in Twilio Video

[2017-05-19] Version 7.10.0
--------------------------
- Add video.twilio.com
- Add additional usage categories
- Fix Client Validation URL encoding
- Close all connections in finally block
- Remove convenience method `getSid()` on records that do not have a sid

[2017-04-27] Version 7.9.1
--------------------------
- Remove conference participant `Beep` and `ConferenceRecord` enums, use `String` instead (backwards incompatible).
- Add `recordingChannels`, `recordingStatusCallback`, `recordingStatusCallbackMethod`, `sipAuthUsername`, `sipAuthPassword`, `region`, `conferenceRecordingStatusCallback`, `conferenceRecordingStatusCallbackMethod` parameter support to conference participant creation.
- Update missing categories in Usage Trigger enums.

[2017-04-18] Version 7.9.0
--------------------------
- Add Twilio Programmable Chat version 2
- Allow updating `AccountSid` on `IncomingPhoneNumber`s
- Include only populated fields in `VideoGrant`
- Deprecate `ConversationsGrant`

[2017-03-22] Version 7.8.1
--------------------------
- Add `validityPeriod` optional parameter to Message creation.
- Add TaskRouterGrant.
- Update VideoGrant.
    - Add `room` as preferred grant granularity.
    - Deprecate setting `configurationProfileSid` on grant.

[2017-03-24] Version 7.8.0
--------------------------
- Fix a bug where unexpected JSON properties caused exceptions.

[2017-03-22] Version 7.7.2
--------------------------
- Add Answering Machine Detection to Call creation
- Add `WRAPPING` entry to Status for Task

- **Twilio Chat**
  - Add `limits` map to Service
  - Add `limitsChannelMembers` and `limitsUserChannels` field to ServiceUpdater

[2017-03-21] Version 7.7.1
--------------------------
- Allow customizing configuration for NetworkHttpClient

[2017-03-10] Version 7.7.0
--------------------------
- Bump Jackson dependency to 2.8.7
- Fix bug in Enum serialization
- Delete `Sandbox`s

[2017-02-28] Version 7.6.0
--------------------------
- Add `ValidationToken`s for Client Validation
- Add `accounts.twilio.com` subdomain
    - Add `PublicKey` resource
- Namespace all path parameters

[2017-02-10] Version 7.5.0
--------------------------
- Add `validated` field to Addresses
- Add FCM Credential support
- Add `Order` parameter to Chat Message filterting
- Remove required updating of `friendlyName` parameter when updating TaskRouter Activities
- Accept multiple `assignmentStatus`'s when filtering `Tasks`
- Fix Workflow json generation
- Add TaskRouterGrant
- Add `recordingStatusCallback` and `recordingStatusCallbackMethod` to Record TwiML

[2017-01-10] Version 7.4.0
--------------------------
- Added new AddOnResults API.
- Allow undocumented TwiML voice parameters for Conference, Dial, and Pause PR #317.
- Fix dates being serialized to null in some locales PR #320.
- Add `emergencyEnabled` field to Addresses.
- Add support for emergency phone numbers.
- Add support for ending conferences via the API.
- Add `region` field to Conferences.

- **Twilio Chat**
    - Add `membersCount` and `messagesCount` to Channel.
    - Add support for filtering on channel type when reading list of Channels.
    - Add `last_consumed_message_index` and `last_consumption_timestamp` fields to Member.
    - Remove ability to update Message body, was never supported by API (backwards incompatible).
    - Add support for new UserChannel Resource.

- **Taskrouter**
    - Add default worker fetch policy PR #313.
    - Add queue ordering for Workspace, TaskQueue.
    - Remove ability to specify `attributes` and `workflowSid` on Task creation (backwards incompatible).
    - Add `addons`, `taskQueueFriendlyName`, `workflowFriendlyName`, metdata to Task.
    - Use DateTimes for WorkspaceStatistics filtering (backwards incompatible).
    - Fix TaskQueueStatistics `cumulative` field incorrect type (backwards incompatible).
    - Fix TaskQueuesStatistics `cumulative` field incorrect type (backwards incompatible).
    - Remove ability to set `friendlyName` on TaskQueueStatistics (backwards incompatible).

[2016-11-30] Version 7.3.0
--------------------------
- Add `recordingStatusCallback` and `recordingStatusCallbackMethod` to Conference TwiML
- Fix TaskRouter Capabaility generation
- Address potential NPE in `ApiException`

[2016-11-16] Version 7.2.0
--------------------------
- Use separate enum for Updating Call `status`. This enum only exposes the statuses that a Call can be updated to.
- Move the `body` parameter to be required in updating Messages.
- Move the `friendlyName` parameter to be required in creating Queues.
- Add Particpant creation to Conferences.
- Add filtering by `CallSid` to Recordings.
- Add missing fields to Call Recordings.
- Add missing fields to Conferences.
- Add missing fields to IncomingPhoneNumbers.
- Add missing fields to Messages.

- **Twilio Chat**
    - Add Invites
    - Add `reachabilityEnabled`, `preWebhookUrl`, `postWebhookUrl`, `webhookMethod`, `webhookFilters`, `notifications` to Services.
    - Add `attributes`, `friendlyName`, `isOnline`, `isNotifiable` to Users.
    - Add `lastConsumedMessageIndex`, `lastConsumptionTimestamp` to Members.
    - Add `attributes`, `index` to Messages.
    - Add ability to update Members.
    - Add filtering by `identity` on Members.
    - Add webhook related parameters to Service updates.
    - Remove updating of `type` on Channels.

[2016-10-05] Version 7.1.0
--------------------------
- Update Usage Records to use `LocalDate` instead of `DateTime`
- Update TwiML Generator to reflect latest docs:
    - Add `statusCallbackEvent`, `statusCallbackMethod`, `statusCallback` to `Conference`
    - Add `recordingStatusCallback`, `recordingStatusCallbackMethod` to `Dial`

[2016-10-04] Version 7.0.0
--------------------------
**New Major Version**

The newest version of the `twilio-java` helper library!

This version brings a host of changes to update and modernize the `twilio-java` helper library. It is auto-generated to produce a more consistent and correct product.

- [Migration Guide](https://www.twilio.com/docs/libraries/java/migration-guide)
- [Full API Documentation](https://twilio.github.io/twilio-java/)
- [General Documentation](https://www.twilio.com/docs/libraries/java)


[2016-01-26] Version 5.9.0
--------------------------
- Add support for WorkerReservations in TaskRouter
- Add support for filterFriendlyName in TaskRouter WorkflowRules
- Fix TaskRouter paging


[2015-12-16] Version 5.8.0
--------------------------
- Add support for IP Messaging


[2015-12-14] Version 5.7.1
--------------------------
- Add new getUsageRecords to support query by intervals
- Fix for ListResource's & NextGenListResource's ListIterator.next()


[2015-12-08] Version 5.7.0
--------------------------
- Change NBF to be optional parameter in AccessToken


[2015-12-03] Version 5.6.0
--------------------------
- Add access tokens


[2015-11-25] Version 5.5.1
--------------------------
- Exposed Recording's PriceUnit field


[2015-11-18] Version 5.5.0
--------------------------
- Fix authentication using key and secret


[2015-10-30] Version 5.4.0
--------------------------
- Add MessagingServiceSid


[2015-10-28] Version 5.3.0
--------------------------
- Add Keys endpoint


[2015-10-02] Version 5.2.1
--------------------------
- Normalized the Number type from spaces to underscore in Pricing Phone Number Country


[2015-09-24] Version 5.2.0
--------------------------
- Add support for TaskRouter reservations
- Add support for TaskRouter TwiML verbs


[2015-09-21] Version 5.1.0
--------------------------
- Add support for messaging in Twilio Pricing API
- Add support for Elastic SIP Trunking's API


[2015-09-14] Version 5.0.0
--------------------------
- Remove deprecated total and numpages from ListResource and response parsers
