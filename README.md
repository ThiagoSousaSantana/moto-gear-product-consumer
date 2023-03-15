# motogear-product-consumer

This API consumes a Kafka message queue and saves the data to a NoSQL database.

## Prerequisites

Before running the API, make sure you have the following installed:

- Java 17 
- Gradle
- Kafka
- A NoSQL database (e.g. MongoDB)

## Installation

1. Clone this repository to your local machine.
2. Open the project in your favorite IDE.
3. Update the `application.yaml` file with your Kafka and database configurations.
4. Run the application using Gradle or your IDE's run command.

To run the application with Gradle, use the following command:
```
./gradlew bootRun
```

## Usage

The API consumes a Kafka message queue and saves the data to a NoSQL database. The expected message format should contain the following fields:

- `id` (int): The unique identifier of the product.
- `name` (string): The name of the product.
- `description` (string): A description of the product.
- `price` (float): The price of the product.
- `imageUrls` (list of strings): A list of URLs to the product images.

When a message is consumed from the Kafka queue, the API will save the data to the configured NoSQL database.

## Contributing

We welcome contributions to this project! To contribute:

1. Fork this repository to your own account.
2. Create a branch with your changes: `git checkout -b my-new-feature`.
3. Commit your changes: `git commit -am 'Add some feature'`.
4. Push the branch to your fork: `git push origin my-new-feature`.
5. Submit a pull request to this repository.

## License

This project is licensed under the MIT License - see the LICENSE file for details.