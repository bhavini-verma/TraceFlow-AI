@echo off
rem Kill any process using port 8082
for /f "tokens=5" %%a in ('netstat -ano ^| findstr :8082 ^| findstr LISTENING') do (
    echo Killing process with PID %%a
    taskkill /F /PID %%a >nul 2>&1
)

rem Start the Spring Boot application
call mvnw.cmd spring-boot:run
