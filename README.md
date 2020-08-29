A sample app using AWS corretto, gradle, spring boot, spring web, and DockerFile to deploy in fargate

<ins>prerequisites<ins>:
- java 11
- docker

<ins>how to<ins>:
- build: ./gradlew build
- run: ./gradlew bootRun
- dockerize: docker build -t sercasti/demo .
- run docker: docker run -v ${HOME}/.aws/credentials:/root/.aws/credentials:ro -p 8080:8080 --rm sercasti/demo

<ins>Push to ECR<ins>:
1. Tag: docker tag <yourImageId> <yourAws_Account_id>.dkr.ecr.us-east-1.amazonaws.com/<yourRepoName>
2. ecr login: aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin <yourAws_Account_id>.dkr.ecr.us-east-1.amazonaws.com
3. docker push <yourAws_Account_id>.dkr.ecr.us-east-1.amazonaws.com/<yourRepoName>