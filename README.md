# VIN Decoder API 🚗

This is a Spring Boot project that decodes VIN numbers using a stored procedure (`spVinDecode`) from a SQL Server database (vPIC dataset).

 #Features
- Spring Boot + Java 17
- VIN decoding API (`/api/vin/decode`)
- Connects to local SQL Server `.bak` restored DB
- Calls stored procedure to return decoded vehicle info

# ▶How to Run
1. Restore the `.bak` file into SQL Server
2. Configure `application.properties` with your DB details
3. Run the project with `gradle build +gradle bootrun
4. Call the API:http://localhost:8080/api/vin/decode?vin=your vin id here.
