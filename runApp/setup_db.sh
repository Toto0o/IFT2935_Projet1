echo "Setting up the database..."

# Check if the database already exists
if psql -U postgres -lqt | cut -d \| -f 1 | grep -qw "kijiji"; then
    echo "Database 'kijiji' already exists. Skipping creation."
else
    # Create the database
    createdb -U postgres kijiji
    echo "Database 'kijiji' created successfully."
fi

# Check if the user already exists
if psql -U postgres -tAc "SELECT 1 FROM pg_roles WHERE rolname='myappuser'" | grep -q 1; then
    echo    "User 'myappuser' already exists. Skipping creation."
else
    # Create the user and grant privileges
    psql -U postgres -c "CREATE USER myappuser WITH PASSWORD 'password';"
    psql -U postgres -c "GRANT ALL PRIVILEGES ON DATABASE kijiji TO myappuser;"
    echo "User 'myappuser' created and granted privileges on 'kijiji'."
fi

<<<<<<< HEAD
=======
### MODIFICATIONS - ALICIA
psql -c "GRANT ALL PRIVILEGES ON DATABASE kijiji TO myappuser;"   # AJOUT DE GRANT MÊME SI LE USER EXISTE
psql -d kijiji -c "GRANT ALL ON SCHEMA public TO myappuser;"
psql -d kijiji -c "ALTER SCHEMA public OWNER TO myappuser;"
### FIN MODIFICATION - ALICIA

>>>>>>> 89d07eeea4b981cefcfa0e736e4c26402a4eed63
echo "Running database setup DDL.sql script..."
# Run the DDL.sql script to set up the database schema
psql -U myappuser -d kijiji -f /db_config/DDL.sql

echo "Filling database with intial data from inserts.sql script..."
# Run the inserts.sql script to populate the database with initial data
echo "Filling database with users..."
psql -U myappuser -d kijiji -f /db_config/inserts_users.sql
<<<<<<< HEAD

echo "Filling database with products..."
psql -U myappuser -d kijiji -f /db_config/inserts_products.sql

echo "Filling database with offers..."
psql -U myappuser -d kijiji -f /db_config/inserts_offers.sql

echo "Filling database with estimations..."
psql -U myappuser -d kijiji -f /db_config/inserts_estimations.sql

echo "Database setup completed successfully."
=======
# psql -U myappuser -d kijiji -f db_config/insert_users.sql     MODIFICATION - ALICIA

echo "Filling database with products..."
psql -U myappuser -d kijiji -f /db_config/inserts_products.sql
# psql -U myappuser -d kijiji -f db_config/insert_products.sql     MODIFICAION - ALICIA

echo "Filling database with offers..."
psql -U myappuser -d kijiji -f /db_config/inserts_offers.sql
# psql -U myappuser -d kijiji -f db_config/insert_offers.sql     MODIFICATION - ALICIA

echo "Filling database with estimations..."
psql -U myappuser -d kijiji -f /db_config/inserts_estimations.sql
#3 psql -U myappuser -d kijiji -f db_config/insert_estimations.sql     MODIFICATION - ALICIA

echo "Database setup completed successfully."
>>>>>>> 89d07eeea4b981cefcfa0e736e4c26402a4eed63
