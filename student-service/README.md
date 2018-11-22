# Student service

- for access token use below command with httppie

http --form POST localhost:8100/oauth/token Authorization:"Basic <basic-auth>" grant_type=client_credentials
http --form localhost:8100/oauth/check_token Authorization:"Bearer <access-token>" token=<access-token>
