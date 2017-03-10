cmake_minimum_required(VERSION 3.4.1)

project(native-lib)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")

add_library( native-lib
             SHARED
             native-lib.cpp )

target_link_libraries( native-lib )