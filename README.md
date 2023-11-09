# Steps to execute Simple Lambda function  

### Step 1: Package Your Lambda Function  

1. Build your Java Lambda function and create a JAR file that contains your compiled code, including the MyLambdaHandler class and the custom request/response classes.  
2. Make sure the JAR file includes all necessary dependencies, as defined in your pom.xml file.  

### Step 2: Create an AWS Lambda Function  
1. Open the AWS Management Console.  
2. Navigate to the AWS Lambda service.  
3. Click the "Create function" button.  
4. Choose "Author from scratch."  
5. Fill out the following details:  
    1. Function name: Enter a name for your Lambda function, e.g., "MyJavaLambdaFunction."  
    2. Runtime: Select "Java 11."  
    3. Role: Create a new role with basic Lambda permissions or choose an existing role with Lambda execution permissions.  
6. Click the "Create function" button to create your Lambda function.  

### Step 3: Configure Your Lambda Function  
1. In the Lambda function configuration, scroll down to the "Function code" section.  
2. In the "Function package" section, select "Upload a .zip file."  
3. Upload the JAR file you created earlier.  
4. Set the "Handler" to the full path of your Lambda handler class, including the package name and class name: com.example.MyLambdaHandler::handleRequest  

### Step 4: Configure Test Event  
1. In the Lambda function configuration, click the "Test" button.  
2. Configure a test event with sample input data for your Lambda function. For example:  

```
{
  "num1": 5,
  "num2": 10
}
```

### Step 5: Test Your Lambda Function  
1. In the Lambda function configuration, click the "Test" button again.  
2. Select the test event you created earlier.  
3. Click the "Test" button to execute your Lambda function with the test event.  
4. View the execution results, including the output from your Lambda function.  

### Step 6: Monitor and Deploy  
1. Monitor the execution of your Lambda function in the AWS CloudWatch Logs to check for any errors or issues.  
2. If everything works as expected, you can integrate your Lambda function with other AWS services or API Gateway, or you can trigger it using various events.  
