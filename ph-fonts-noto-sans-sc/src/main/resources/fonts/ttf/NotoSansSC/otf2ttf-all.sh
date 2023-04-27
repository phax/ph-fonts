#/bin/sh

# Make sure the base tool is up to date
# Source: https://github.com/awesometoolbox/otf2ttf
pip install --upgrade otf2ttf

# Convert all files
for f in ./*.otf; do echo "Converting $f" && otf2ttf $f; done
