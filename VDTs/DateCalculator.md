| Name       | Datatype | Description                                                   |
|------------|----------|---------------------------------------------------------------|
| dayNum     | int      | The input day number (1-366 for leap years, 1-365 for others) |
| year       | int      | The input year (4 digits)                                     |
| N          | int      | Number of days to add to the original date                    |
| monthDays  | int[]    | Array holding the days in each month                          |
| monthNames | String[] | Array holding the names of each month                         |
| leap       | boolean  | Indicates if the input year is a leap year                    |
| daySum     | int      | Running sum of days to determine the month                    |
| date       | int      | The final day of the month after calculating                  |
| i          | int      | Loop variable to iterate through the monthDays array          |
| nDays      | int      | The day number after adding N days                            |
| nYear      | int      | The year for the future date                                  |
| dateStr    | String   | Formatted date for the initial day number                     |
| nDateStr   | String   | Formatted date after N days                                   |
