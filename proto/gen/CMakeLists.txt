file(GLOB srcs *.cc)
add_library(protos ${srcs})
target_include_directories(protos PUBLIC ${CMAKE_CURRENT_SOURCE_DIR})
