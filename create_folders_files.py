import os

os.chdir(os.path.dirname(os.path.abspath(__file__)))

# Paths to the folders
src_dir = 'Programs'
folders = {
  'Algorithms': 'txt',
  'VDTs': 'csv',
  'Outputs': 'folder'
}

# variable to run program without making the files and folders
dry_run = True

files = os.listdir(src_dir)

for dest, ext in folders.items():
  
  print(f'\n┌─ {dest} --> {ext}\n│')
  if not os.path.exists(dest) and not dry_run:
    os.makedirs(dest)

  
  for i, file in enumerate(files):
    base, _ = os.path.splitext(file)
    
    created = ""
    
    # If required to make a folder with the file_name
    # rather than add an extension
    if ext == 'folder':
      folder_path = os.path.join(dest, base)
      
      if not os.path.exists(folder_path) and not dry_run:
        os.makedirs(folder_path)
      
      created = f'{base}/'  # folder_name
    else:
      new_file = f'{base}.{ext}'
      
      # Create the new file path in the folder with the new extension
      new_file_path = os.path.join(dest, new_file)
      
      created = new_file
    
    if i == len(files) - 1:
      print('└', end='')
    else:
      print('├', end='')
    print('────', created)
    
    # Create the new file (write mode to create an empty file)
    if not dry_run: open(new_file_path, 'w')


