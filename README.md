
Simple Numbers
==================

Version: v0

BasePath:/http://localhost:8097/

All rights reserved

http://apache.org/licenses/LICENSE-2.0.html

Access
------

Methods
-------

\[ Jump to [Models](#__Models) \]

### Table of Contents

#### [NumberController](#NumberController)

*   [`get /v1/numbers/apsequence`](#getApSequence)
*   [`get /v1/numbers/circularprime`](#getCircularPrimeOrNot)
*   [`get /v1/numbers/countofdigits`](#getCountOfDigits)
*   [`get /v1/numbers/digitatspeceficplace`](#getDigitAtSpeceficPlace)
*   [`get /v1/numbers/divisability`](#getDivisabilityOfNumber)
*   [`get /v1/numbers/fibonacciseries`](#getFibonacciNumbers)
*   [`get /v1/numbers/gcd`](#getGCD)
*   [`get /v1/numbers/gpsequence`](#getGpSequence)
*   [`get /v1/numbers/kthlargestdigit`](#getKthLargestDigit)
*   [`get /v1/numbers/kthsmallestdigit`](#getKthSmallestDigit)
*   [`get /v1/numbers/lcm`](#getLCM)
*   [`get /v1/numbers/largestdigit`](#getLargestDigit)
*   [`get /v1/numbers/palindrome`](#getPalindromeNumber)
*   [`get /v1/numbers/perfectsquare`](#getPerfectSquare)
*   [`get /v1/numbers/primefactors`](#getPrimeFactorsOfNumber)
*   [`get /v1/numbers/prime`](#getPrimeOrNot)
*   [`get /v1/numbers/primessmaller`](#getPrimesSmallerThanNumber)
*   [`get /v1/numbers/reversenumber`](#getReverseNumber)
*   [`get /v1/numbers/rotatedigits`](#getRotateDigits)
*   [`get /v1/numbers/secondlargestdigit`](#getSecondLargestDigit)
*   [`get /v1/numbers/secondsmallestdigit`](#getSecondSmallestDigit)
*   [`get /v1/numbers/smallestdigit`](#getSmallestDigit)
*   [`get /v1/numbers/sumofdigits`](#getSumOfDigits)
*   [`get /v1/numbers/sumoffirstnnnumbers`](#getSumOfFirstNNumbers)

NumberController
================

[Up](#__Methods)

    get /v1/numbers/apsequence

(getApSequence)

### Query parameters

firstTerm (required)

Query Parameter — format: int32

commondifference (required)

Query Parameter — format: int32

length (required)

Query Parameter — format: int32

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/circularprime

(getCircularPrimeOrNot)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/countofdigits

(getCountOfDigits)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/digitatspeceficplace

(getDigitAtSpeceficPlace)

### Query parameters

number (required)

Query Parameter — format: int64

pos (required)

Query Parameter — format: int32

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/divisability

(getDivisabilityOfNumber)

### Query parameters

number (required)

Query Parameter — format: int64

divider (required)

Query Parameter — format: int32

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/fibonacciseries

(getFibonacciNumbers)

### Query parameters

n (required)

Query Parameter — format: int32

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/gcd

(getGCD)

### Query parameters

a (required)

Query Parameter — format: int32

b (required)

Query Parameter — format: int32

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/gpsequence

(getGpSequence)

### Query parameters

firstTerm (required)

Query Parameter — format: int32

commonratio (required)

Query Parameter — format: int32

length (required)

Query Parameter — format: int32

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/kthlargestdigit

(getKthLargestDigit)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/kthsmallestdigit

(getKthSmallestDigit)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/lcm

(getLCM)

### Query parameters

a (required)

Query Parameter — format: int32

b (required)

Query Parameter — format: int32

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/largestdigit

(getLargestDigit)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/palindrome

(getPalindromeNumber)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/perfectsquare

(getPerfectSquare)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/primefactors

(getPrimeFactorsOfNumber)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/prime

(getPrimeOrNot)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/primessmaller

(getPrimesSmallerThanNumber)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/reversenumber

(getReverseNumber)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/rotatedigits

(getRotateDigits)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/secondlargestdigit

(getSecondLargestDigit)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/secondsmallestdigit

(getSecondSmallestDigit)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/smallestdigit

(getSmallestDigit)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/sumofdigits

(getSumOfDigits)

### Query parameters

number (required)

Query Parameter — format: int64

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

[Up](#__Methods)

    get /v1/numbers/sumoffirstnnnumbers

(getSumOfFirstNNumbers)

### Query parameters

n (required)

Query Parameter — format: int32

### Return type

String

### Example data

Content-Type: application/json

    ""

### Produces

This API call produces the following media types according to the Accept request header; the media type will be conveyed by the Content-Type response header.

*   `*/*`

### Responses

#### 200

OK [String](#String)

* * *

Models
------

\[ Jump to [Methods](#__Methods) \]

### Table of Contents
