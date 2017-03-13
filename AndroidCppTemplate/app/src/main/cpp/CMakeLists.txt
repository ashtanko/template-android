cmake_minimum_required(VERSION 3.4.1)

project(main)

set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=gnu++11")

add_library( main
             SHARED
             main.cpp )

find_library( log-lib
              log )

target_link_libraries( main
                       ${log-lib} )