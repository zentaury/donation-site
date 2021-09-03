# ONLINE DONATION SITE
he following project follows a creation under MVC and DDD structure following the order for an orderly and persistent development, suitable for scalability.

## INSTRUCTIONS 
1. Inside the db folder you can find the .sql file so you can run it in your MySQL database manager. You will also find the Entity Relationship diagram
2. If you have a password for your database manager you can place it in the application.properties file to be able to connect correctly.
3. Download the MAVEN dependencies for the correct operation of the project.
4. Run the application.

## ENDPOINTS
```
localhost/api/v1/donations
```
```
localhost/api/v1/countries
```


## PROJECT STRUCTURE

```
C:.
│   .gitignore
│   DonationSite.iml
│   HELP.md
│   mvnw
│   mvnw.cmd
│   pom.xml
│   README.md
│
├───.idea
│   │   .gitignore
│   │   .name
│   │   compiler.xml
│   │   encodings.xml
│   │   jarRepositories.xml
│   │   jpa-buddy.xml
│   │   misc.xml
│   │   modules.xml
│   │   runConfigurations.xml
│   │   uiDesigner.xml
│   │   vcs.xml
│   │   workspace.xml
│   │
│   └───libraries
│           Maven__antlr_antlr_2_7_7.xml
│           Maven__ch_qos_logback_logback_classic_1_2_5.xml
│           Maven__ch_qos_logback_logback_core_1_2_5.xml
│           Maven__com_fasterxml_classmate_1_5_1.xml
│           Maven__com_fasterxml_jackson_core_jackson_annotations_2_12_4.xml
│           Maven__com_fasterxml_jackson_core_jackson_core_2_12_4.xml
│           Maven__com_fasterxml_jackson_core_jackson_databind_2_12_4.xml
│           Maven__com_fasterxml_jackson_datatype_jackson_datatype_jdk8_2_12_4.xml
│           Maven__com_fasterxml_jackson_datatype_jackson_datatype_jsr310_2_12_4.xml
│           Maven__com_fasterxml_jackson_module_jackson_module_parameter_names_2_12_4.xml
│           Maven__com_jayway_jsonpath_json_path_2_5_0.xml
│           Maven__com_sun_activation_jakarta_activation_1_2_2.xml
│           Maven__com_sun_istack_istack_commons_runtime_3_0_12.xml
│           Maven__com_vaadin_external_google_android_json_0_0_20131108_vaadin1.xml
│           Maven__com_zaxxer_HikariCP_4_0_3.xml
│           Maven__io_github_classgraph_classgraph_4_8_69.xml
│           Maven__jakarta_activation_jakarta_activation_api_1_2_2.xml
│           Maven__jakarta_annotation_jakarta_annotation_api_1_3_5.xml
│           Maven__jakarta_persistence_jakarta_persistence_api_2_2_3.xml
│           Maven__jakarta_transaction_jakarta_transaction_api_1_3_3.xml
│           Maven__jakarta_xml_bind_jakarta_xml_bind_api_2_3_3.xml
│           Maven__mysql_mysql_connector_java_8_0_26.xml
│           Maven__net_bytebuddy_byte_buddy_1_10_22.xml
│           Maven__net_bytebuddy_byte_buddy_agent_1_10_22.xml
│           Maven__net_minidev_accessors_smart_2_4_7.xml
│           Maven__net_minidev_json_smart_2_4_7.xml
│           Maven__org_apache_commons_commons_lang3_3_12_0.xml
│           Maven__org_apache_logging_log4j_log4j_api_2_14_1.xml
│           Maven__org_apache_logging_log4j_log4j_to_slf4j_2_14_1.xml
│           Maven__org_apache_tomcat_embed_tomcat_embed_core_9_0_52.xml
│           Maven__org_apache_tomcat_embed_tomcat_embed_el_9_0_52.xml
│           Maven__org_apache_tomcat_embed_tomcat_embed_websocket_9_0_52.xml
│           Maven__org_apiguardian_apiguardian_api_1_1_0.xml
│           Maven__org_aspectj_aspectjweaver_1_9_7.xml
│           Maven__org_assertj_assertj_core_3_19_0.xml
│           Maven__org_attoparser_attoparser_2_0_5_RELEASE.xml
│           Maven__org_dom4j_dom4j_2_1_3.xml
│           Maven__org_glassfish_jaxb_jaxb_runtime_2_3_5.xml
│           Maven__org_glassfish_jaxb_txw2_2_3_5.xml
│           Maven__org_hamcrest_hamcrest_2_2.xml
│           Maven__org_hibernate_common_hibernate_commons_annotations_5_1_2_Final.xml
│           Maven__org_hibernate_hibernate_core_5_4_32_Final.xml
│           Maven__org_javassist_javassist_3_27_0_GA.xml
│           Maven__org_jboss_jandex_2_2_3_Final.xml
│           Maven__org_jboss_logging_jboss_logging_3_4_2_Final.xml
│           Maven__org_junit_jupiter_junit_jupiter_5_7_2.xml
│           Maven__org_junit_jupiter_junit_jupiter_api_5_7_2.xml
│           Maven__org_junit_jupiter_junit_jupiter_engine_5_7_2.xml
│           Maven__org_junit_jupiter_junit_jupiter_params_5_7_2.xml
│           Maven__org_junit_platform_junit_platform_commons_1_7_2.xml
│           Maven__org_junit_platform_junit_platform_engine_1_7_2.xml
│           Maven__org_mockito_mockito_core_3_9_0.xml
│           Maven__org_mockito_mockito_junit_jupiter_3_9_0.xml
│           Maven__org_objenesis_objenesis_3_2.xml
│           Maven__org_opentest4j_opentest4j_1_2_0.xml
│           Maven__org_ow2_asm_asm_9_1.xml
│           Maven__org_projectlombok_lombok_1_18_20.xml
│           Maven__org_skyscreamer_jsonassert_1_5_0.xml
│           Maven__org_slf4j_jul_to_slf4j_1_7_32.xml
│           Maven__org_slf4j_slf4j_api_1_7_32.xml
│           Maven__org_springframework_boot_spring_boot_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_autoconfigure_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_devtools_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_aop_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_data_jdbc_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_data_jpa_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_jdbc_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_json_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_logging_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_security_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_test_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_thymeleaf_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_tomcat_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_starter_web_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_test_2_5_4.xml
│           Maven__org_springframework_boot_spring_boot_test_autoconfigure_2_5_4.xml
│           Maven__org_springframework_data_spring_data_commons_2_5_4.xml
│           Maven__org_springframework_data_spring_data_jdbc_2_2_4.xml
│           Maven__org_springframework_data_spring_data_jpa_2_5_4.xml
│           Maven__org_springframework_data_spring_data_relational_2_2_4.xml
│           Maven__org_springframework_security_spring_security_config_5_5_2.xml
│           Maven__org_springframework_security_spring_security_core_5_5_2.xml
│           Maven__org_springframework_security_spring_security_crypto_5_5_2.xml
│           Maven__org_springframework_security_spring_security_test_5_5_2.xml
│           Maven__org_springframework_security_spring_security_web_5_5_2.xml
│           Maven__org_springframework_spring_aop_5_3_9.xml
│           Maven__org_springframework_spring_aspects_5_3_9.xml
│           Maven__org_springframework_spring_beans_5_3_9.xml
│           Maven__org_springframework_spring_context_5_3_9.xml
│           Maven__org_springframework_spring_core_5_3_9.xml
│           Maven__org_springframework_spring_expression_5_3_9.xml
│           Maven__org_springframework_spring_jcl_5_3_9.xml
│           Maven__org_springframework_spring_jdbc_5_3_9.xml
│           Maven__org_springframework_spring_orm_5_3_9.xml
│           Maven__org_springframework_spring_test_5_3_9.xml
│           Maven__org_springframework_spring_tx_5_3_9.xml
│           Maven__org_springframework_spring_webmvc_5_3_9.xml
│           Maven__org_springframework_spring_web_5_3_9.xml
│           Maven__org_thymeleaf_extras_thymeleaf_extras_java8time_3_0_4_RELEASE.xml
│           Maven__org_thymeleaf_extras_thymeleaf_extras_springsecurity5_3_0_4_RELEASE.xml
│           Maven__org_thymeleaf_thymeleaf_3_0_12_RELEASE.xml
│           Maven__org_thymeleaf_thymeleaf_spring5_3_0_12_RELEASE.xml
│           Maven__org_unbescape_unbescape_1_1_6_RELEASE.xml
│           Maven__org_webjars_bootstrap_4_4_1_1.xml
│           Maven__org_webjars_font_awesome_5_12_0.xml
│           Maven__org_webjars_jquery_3_6_0.xml
│           Maven__org_webjars_popper_js_1_14_3.xml
│           Maven__org_webjars_webjars_locator_0_38.xml
│           Maven__org_webjars_webjars_locator_core_0_46.xml
│           Maven__org_xmlunit_xmlunit_core_2_8_2.xml
│           Maven__org_yaml_snakeyaml_1_28.xml
│
├───.mvn
│   └───wrapper
│           maven-wrapper.jar
│           maven-wrapper.properties
│           MavenWrapperDownloader.java
│
├───db
│       donationsiteDB.sql
│       Entity Relationship Diagram.png
│
├───src
│   ├───main
│   │   ├───java
│   │   │   └───sv
│   │   │       └───com
│   │   │           └───ti
│   │   │               └───donationsite
│   │   │                   │   DonationSiteApplication.java
│   │   │                   │
│   │   │                   ├───application
│   │   │                   ├───config
│   │   │                   │       PasswordEncoder.java
│   │   │                   │       SecurityConfig.java
│   │   │                   │       WebConfig.java
│   │   │                   │
│   │   │                   ├───controllers
│   │   │                   │   │   DonationController.java
│   │   │                   │   │   UserController.java
│   │   │                   │   │   VisitController.java
│   │   │                   │   │
│   │   │                   │   └───api
│   │   │                   │           CountryRestController.java
│   │   │                   │           DonationsApiController.java
│   │   │                   │
│   │   │                   ├───domain
│   │   │                   │   ├───DTOs
│   │   │                   │   │   │   RestResponse.java
│   │   │                   │   │   │
│   │   │                   │   │   └───donation
│   │   │                   │   │           DonationForm.java
│   │   │                   │   │           DonationResponse.java
│   │   │                   │   │
│   │   │                   │   ├───entities
│   │   │                   │   │       CountryEntity.java
│   │   │                   │   │       DonationEntity.java
│   │   │                   │   │       RolEntity.java
│   │   │                   │   │       TransactionEntity.java
│   │   │                   │   │       UserEntity.java
│   │   │                   │   │       VisitEntity.java
│   │   │                   │   │
│   │   │                   │   ├───exceptions
│   │   │                   │   └───services
│   │   │                   │           CountryService.java
│   │   │                   │           CountryServiceImpl.java
│   │   │                   │           DonationService.java
│   │   │                   │           DonationServiceImpl.java
│   │   │                   │           RolService.java
│   │   │                   │           RolServiceImpl.java
│   │   │                   │           TransactionService.java
│   │   │                   │           TransactionServiceImpl.java
│   │   │                   │           UserService.java
│   │   │                   │           VisitService.java
│   │   │                   │           VisitServiceImpl.java
│   │   │                   │
│   │   │                   └───repositories
│   │   │                           CountryRepository.java
│   │   │                           DonationRepository.java
│   │   │                           RolRepository.java
│   │   │                           TransactionRepository.java
│   │   │                           UserRepository.java
│   │   │                           VisitRepository.java
│   │   │
│   │   └───resources
│   │       │   application.properties
│   │       │
│   │       ├───static
│   │       │   ├───css
│   │       │   │       index.css
│   │       │   │
│   │       │   └───js
│   │       │           index.js
│   │       │
│   │       └───templates
│   │           │   donation.html
│   │           │   donationFailed.html
│   │           │   donationSuccess.html
│   │           │   index.html
│   │           │   login.html
│   │           │   registration.html
│   │           │
│   │           ├───templates.errors
│   │           │       403.html
│   │           │
│   │           ├───templates.layout
│   │           │       template.html
│   │           │
│   │           └───templates.user
│   └───test
│       └───java
│           └───sv
│               └───com
│                   └───ti
│                       └───donationsite
│                               DonationSiteApplicationTests.java
│
└───target
    ├───classes
    │   │   application.properties
    │   │
    │   ├───static
    │   │   ├───css
    │   │   │       index.css
    │   │   │
    │   │   └───js
    │   │           index.js
    │   │
    │   ├───sv
    │   │   └───com
    │   │       └───ti
    │   │           └───donationsite
    │   │               │   DonationSiteApplication.class
    │   │               │
    │   │               ├───config
    │   │               │       PasswordEncoder.class
    │   │               │       SecurityConfig.class
    │   │               │       WebConfig.class
    │   │               │
    │   │               ├───controllers
    │   │               │   │   DonationController.class
    │   │               │   │   UserController.class
    │   │               │   │   VisitController.class
    │   │               │   │
    │   │               │   └───api
    │   │               │           CountryRestController.class
    │   │               │           DonationsApiController.class
    │   │               │
    │   │               ├───domain
    │   │               │   ├───DTOs
    │   │               │   │   │   RestResponse.class
    │   │               │   │   │
    │   │               │   │   └───donation
    │   │               │   │           DonationForm.class
    │   │               │   │           DonationResponse.class
    │   │               │   │
    │   │               │   ├───entities
    │   │               │   │       CountryEntity.class
    │   │               │   │       DonationEntity.class
    │   │               │   │       RolEntity.class
    │   │               │   │       TransactionEntity.class
    │   │               │   │       UserEntity.class
    │   │               │   │       VisitEntity.class
    │   │               │   │
    │   │               │   └───services
    │   │               │           CountryService.class
    │   │               │           CountryServiceImpl.class
    │   │               │           DonationService.class
    │   │               │           DonationServiceImpl.class
    │   │               │           RolService.class
    │   │               │           RolServiceImpl.class
    │   │               │           TransactionService.class
    │   │               │           TransactionServiceImpl.class
    │   │               │           UserService.class
    │   │               │           VisitService.class
    │   │               │           VisitServiceImpl.class
    │   │               │
    │   │               └───repositories
    │   │                       CountryRepository.class
    │   │                       DonationRepository.class
    │   │                       RolRepository.class
    │   │                       TransactionRepository.class
    │   │                       UserRepository.class
    │   │                       VisitRepository.class
    │   │
    │   └───templates
    │       │   donation.html
    │       │   donationFailed.html
    │       │   donationSuccess.html
    │       │   index.html
    │       │   login.html
    │       │   registration.html
    │       │
    │       ├───templates.errors
    │       │       403.html
    │       │
    │       └───templates.layout
    │               template.html
    │
    ├───generated-sources
    │   └───annotations
    ├───generated-test-sources
    │   └───test-annotations
    └───test-classes
        └───sv
            └───com
                └───ti
                    └───donationsite
                            DonationSiteApplicationTests.class


```