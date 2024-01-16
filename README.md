# Library Management System (LMS)

## Overview

The Library Management System (LMS) project is designed to improve traditional library operations by making processes more efficient and user-friendly. It introduces a streamlined approach to managing library items, borrowers, and transactions.

## Project Structure

### 1. Interface - Borrowable
The `Borrowable` interface sets the foundation for items that can be borrowed from the library, ensuring a common structure for various materials.

### 2. Classes
- **Audiobook:** Represents audio materials available for borrowing.
- **Book:** Represents printed books that can be borrowed from the library.
- **Borrower:** Manages information about individuals borrowing items from the library.
- **Borrowing:** Tracks the borrowing transactions, including dates and return status.
- **Branch:** Represents library branches, each with its unique catalog and inventory.
- **Catalog:** Manages the inventory and organization of items within a library branch.
- **DVD:** Represents video materials available for borrowing.
- **Library:** Acts as the main orchestrator, overseeing the functioning of the library system.
- **LibraryItem:** Serves as a base class for library items, implementing the `Borrowable` interface.
- **Main:** The main class that initiates and runs the Library Management System.

## Thank You
Thank you for exploring our Library Management System (LMS) project! We hope this system adds value to your understanding of library operations and inspires improvements in the way we manage and share knowledge.
Your interest and potential contributions are highly appreciated. If you have any questions, suggestions, or ideas, please feel free to reach out. Together, we can make library experiences more enjoyable and efficient.
